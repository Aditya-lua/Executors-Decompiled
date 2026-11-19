; RAND_keep_random_devices_open @ 00ac7b70
00ac7b70	str x19,[sp, #-0x20]!
00ac7b74	mov w19,w0
00ac7b78	adrp x0,0xd22000
00ac7b7c	adrp x1,0xac7000
00ac7b80	add x0,x0,#0x210
00ac7b84	add x1,x1,#0xbc0
00ac7b88	stp x29,x30,[sp, #0x10]
00ac7b8c	add x29,sp,#0x10
00ac7b90	bl 0x00c34d60
00ac7b94	cbz w0,0x00ac7bb4
00ac7b98	adrp x8,0xd22000
00ac7b9c	ldr w8,[x8, #0x214]
00ac7ba0	cbz w8,0x00ac7bb4
00ac7ba4	ldp x29,x30,[sp, #0x10]
00ac7ba8	mov w0,w19
00ac7bac	ldr x19,[sp], #0x20
00ac7bb0	b 0x00c3f990
00ac7bb4	ldp x29,x30,[sp, #0x10]
00ac7bb8	ldr x19,[sp], #0x20
00ac7bbc	ret
