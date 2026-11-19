; tls1_get_formatlist @ 009c1b64
009c1b64	ldr x8,[x0, #0xaa8]
009c1b68	cbz x8,0x009c1b7c
009c1b6c	str x8,[x1]
009c1b70	ldr x8,[x0, #0xaa0]
009c1b74	str x8,[x2]
009c1b78	ret
009c1b7c	adrp x8,0x74c000
009c1b80	add x8,x8,#0xd88
009c1b84	str x8,[x1]
009c1b88	ldr x8,[x0, #0x898]
009c1b8c	ldrb w8,[x8, #0x1e]
009c1b90	tst w8,#0x3
009c1b94	mov w8,#0x2
009c1b98	cinc x8,x8,eq
009c1b9c	str x8,[x2]
009c1ba0	ret
