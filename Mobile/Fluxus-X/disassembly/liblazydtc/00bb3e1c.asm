; ZSTD_sizeof_DDict @ 00bb3e1c
00bb3e1c	cbz x0,0x00bb3e34
00bb3e20	ldr x8,[x0]
00bb3e24	cbz x8,0x00bb3e38
00bb3e28	ldr x8,[x0, #0x10]
00bb3e2c	mov w9,#0x6ad8
00bb3e30	add x0,x8,x9
00bb3e34	ret
00bb3e38	mov w0,#0x6ad8
00bb3e3c	ret
