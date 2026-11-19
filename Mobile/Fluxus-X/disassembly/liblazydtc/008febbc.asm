; cpr::UnixSocket::GetUnixSocketString @ 008febbc
008febbc	ldrb w8,[x0]
008febc0	tbnz w8,#0x0,0x008febcc
008febc4	add x0,x0,#0x1
008febc8	ret
008febcc	ldr x0,[x0, #0x10]
008febd0	ret
