; _INIT_180 @ 008fb0b0
008fb0b0	adrp x0,0xcb4000
008fb0b4	adrp x1,0xcb4000
008fb0b8	ldr x0,[x0, #0x958]
008fb0bc	ldr x1,[x1, #0xc70]
008fb0c0	adrp x2,0xc48000
008fb0c4	add x2,x2,#0x880
008fb0c8	b 0x00c2fe70
