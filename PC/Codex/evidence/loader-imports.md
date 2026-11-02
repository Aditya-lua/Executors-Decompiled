# Loader import evidence

This is a static inventory of the process-manipulation imports exposed by
`loader-0.745.0.7451137.exe`. It was collected with `objdump -p`; the loader
was not executed.

## Kernel32

- `OpenProcess`
- `CreateToolhelp32Snapshot`
- `Process32FirstW` / `Process32NextW`
- `CreateThread`
- `OpenThread`
- `SuspendThread` / `ResumeThread`
- `VirtualAllocEx` / `VirtualFreeEx`
- `VirtualProtectEx` / `VirtualQueryEx`
- `ReadProcessMemory` / `WriteProcessMemory`
- `GetProcAddress` / `LoadLibraryA`

## Ntdll

- `NtCreateSection`
- `NtMapViewOfSection`
- `NtUnmapViewOfSection`

These imports establish cross-process memory access, section mapping, and
thread-control capability. They are evidence of injection machinery, but do
not by themselves identify or prove a particular anti-cheat bypass.
