# HavenHomes

A lightweight, GUI-based homes plugin for Minecraft servers built with the Paper API.

HavenHomes allows players to create, manage, teleport to, and delete homes through an intuitive inventory GUI rather than traditional commands.

## Features

### Home Management

* Create homes through a GUI
* Name homes using chat input
* Support for spaces in home names
* Configurable maximum home limit
* Delete homes with confirmation menus
* View all saved homes through a dedicated GUI

### Teleportation System

* Configurable teleport delay
* Move-to-cancel functionality
* Countdown title display
* Teleport sounds
* Portal particle effects at departure and arrival

### Persistence

* Homes are saved to `homes.yml`
* Homes automatically reload when the server starts
* Data persists through restarts and shutdowns

### GUI Features

* Main menu navigation
* View Homes menu
* Delete Homes menu
* Delete confirmation menu
* Back buttons for navigation
* Glass pane GUI decoration
* Empty-state menus when no homes exist
* CustomModelData support for future resource pack integration

## Commands

| Command  | Description               |
| -------- | ------------------------- |
| `/homes` | Opens the HavenHomes menu |

## Configuration

`config.yml`

```yml
max-homes: 3
teleport-delay-seconds: 5
```

### Settings

| Setting                  | Description                                 |
| ------------------------ | ------------------------------------------- |
| `max-homes`              | Maximum number of homes a player can create |
| `teleport-delay-seconds` | Teleport countdown duration                 |

## Data Storage

Homes are stored in:

```text
plugins/HavenHomes/homes.yml
```

Example:

```yml
players:
  player-uuid:
    homes:
      Base:
        world: world
        x: 100.5
        y: 64.0
        z: -200.5
        yaw: 90.0
        pitch: 0.0
```

## Technical Overview

Built using:

* Java
* Paper API
* Inventory GUI system
* Event-driven architecture
* YAML persistence

### Project Structure

```text
me.david.havenHomes
│
├── commands
├── gui
├── listeners
├── managers
├── models
└── HavenHomes
```

## Future Plans

* Resource pack icons
* Permissions-based home limits
* Home renaming
* Home favourites
* Multiple GUI pages
* Admin home management

## Author

David White

University of Strathclyde Computer Science Student
