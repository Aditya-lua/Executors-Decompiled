; FUN_0092f1bc @ 0092f1bc
0092f1bc	cbz x0,0x0092f1d0
0092f1c0	ldr x8,[x0, #0xc0]
0092f1c4	cbz x8,0x0092f1d4
0092f1c8	ldrb w8,[x8, #0x231]
0092f1cc	ubfx w0,w8,#0x2,#0x1
0092f1d0	ret
0092f1d4	mov w0,wzr
0092f1d8	ret
