; OBJ_create @ 00aaeb74
00aaeb74	sub sp,sp,#0x70
00aaeb78	stp x22,x21,[sp, #0x40]
00aaeb7c	stp x20,x19,[sp, #0x50]
00aaeb80	mov x19,x2
00aaeb84	mov x20,x1
00aaeb88	mov x21,x0
00aaeb8c	stp x29,x30,[sp, #0x60]
00aaeb90	add x29,sp,#0x60
00aaeb94	cbz x1,0x00aaec24
00aaeb98	add x22,sp,#0x18
00aaeb9c	mov w0,#0x40
00aaeba0	mov x1,xzr
00aaeba4	str x22,[sp, #0x10]
00aaeba8	bl 0x00c35500
00aaebac	adrp x8,0xd22000
00aaebb0	ldr x0,[x8, #0x188]
00aaebb4	str x20,[sp, #0x18]
00aaebb8	cbz x0,0x00aaebdc
00aaebbc	mov w8,#0x1
00aaebc0	mov x1,sp
00aaebc4	str w8,[sp]
00aaebc8	str x22,[sp, #0x8]
00aaebcc	bl 0x00c34de0
00aaebd0	cbz x0,0x00aaebdc
00aaebd4	ldr x8,[x0, #0x8]
00aaebd8	b 0x00aaec18
00aaebdc	adrp x1,0x770000
00aaebe0	adrp x4,0xaaf000
00aaebe4	add x1,x1,#0xef8
00aaebe8	add x4,x4,#0xa8
00aaebec	add x0,sp,#0x10
00aaebf0	mov w2,#0x4d7
00aaebf4	mov w3,#0x4
00aaebf8	mov w5,wzr
00aaebfc	bl 0x00c3de50
00aaec00	cbz x0,0x00aaec24
00aaec04	ldr w8,[x0]
00aaec08	adrp x10,0xc6d000
00aaec0c	mov w9,#0x28
00aaec10	add x10,x10,#0xa58
00aaec14	madd x8,x8,x9,x10
00aaec18	add x8,x8,#0x10
00aaec1c	ldr w8,[x8]
00aaec20	cbnz w8,0x00aaecb4
00aaec24	cbz x19,0x00aaece4
00aaec28	add x22,sp,#0x18
00aaec2c	mov w0,#0x40
00aaec30	mov x1,xzr
00aaec34	str x22,[sp, #0x10]
00aaec38	bl 0x00c35500
00aaec3c	adrp x8,0xd22000
00aaec40	ldr x0,[x8, #0x188]
00aaec44	str x19,[sp, #0x20]
00aaec48	cbz x0,0x00aaec6c
00aaec4c	mov w8,#0x2
00aaec50	mov x1,sp
00aaec54	str w8,[sp]
00aaec58	str x22,[sp, #0x8]
00aaec5c	bl 0x00c34de0
00aaec60	cbz x0,0x00aaec6c
00aaec64	ldr x8,[x0, #0x8]
00aaec68	b 0x00aaeca8
00aaec6c	adrp x1,0x76f000
00aaec70	adrp x4,0xaaf000
00aaec74	add x1,x1,#0xb9c
00aaec78	add x4,x4,#0x80
00aaec7c	add x0,sp,#0x10
00aaec80	mov w2,#0x4d7
00aaec84	mov w3,#0x4
00aaec88	mov w5,wzr
00aaec8c	bl 0x00c3de50
00aaec90	cbz x0,0x00aaece4
00aaec94	ldr w8,[x0]
00aaec98	adrp x10,0xc6d000
00aaec9c	mov w9,#0x28
00aaeca0	add x10,x10,#0xa58
00aaeca4	madd x8,x8,x9,x10
00aaeca8	add x8,x8,#0x10
00aaecac	ldr w8,[x8]
00aaecb0	cbz w8,0x00aaece4
00aaecb4	bl 0x00c342a0
00aaecb8	adrp x0,0x2d8000
00aaecbc	adrp x2,0x2ac000
00aaecc0	add x0,x0,#0x291
00aaecc4	add x2,x2,#0x3d6
00aaecc8	mov w1,#0x2d0
00aaeccc	bl 0x00c342b0
00aaecd0	mov w0,#0x8
00aaecd4	mov w1,#0x66
00aaecd8	mov x2,xzr
00aaecdc	bl 0x00c342c0
00aaece0	b 0x00aaed40
00aaece4	mov w1,#0x1
00aaece8	mov x0,x21
00aaecec	bl 0x00aae250
00aaecf0	cbz x0,0x00aaed40
00aaecf4	str x0,[sp]
00aaecf8	ldr w8,[x0, #0x10]
00aaecfc	mov x21,x0
00aaed00	cbz w8,0x00aaed5c
00aaed04	bl 0x00c342a0
00aaed08	adrp x0,0x2d8000
00aaed0c	adrp x2,0x2ac000
00aaed10	add x0,x0,#0x291
00aaed14	add x2,x2,#0x3d6
00aaed18	mov w1,#0x2db
00aaed1c	bl 0x00c342b0
00aaed20	mov w0,#0x8
00aaed24	mov w1,#0x66
00aaed28	mov x2,xzr
00aaed2c	bl 0x00c342c0
00aaed30	mov w19,wzr
00aaed34	mov x0,x21
00aaed38	bl 0x00c37660
00aaed3c	b 0x00aaed44
00aaed40	mov w19,wzr
00aaed44	mov w0,w19
00aaed48	ldp x29,x30,[sp, #0x60]
00aaed4c	ldp x20,x19,[sp, #0x50]
00aaed50	ldp x22,x21,[sp, #0x40]
00aaed54	add sp,sp,#0x70
00aaed58	ret
00aaed5c	ldr w8,[x21, #0x14]
00aaed60	cbz w8,0x00aaede0
00aaed64	mov w0,#0x40
00aaed68	mov x1,xzr
00aaed6c	bl 0x00c35500
00aaed70	adrp x8,0xd22000
00aaed74	ldr x0,[x8, #0x188]
00aaed78	cbz x0,0x00aaed98
00aaed7c	add x1,sp,#0x18
00aaed80	str wzr,[sp, #0x18]
00aaed84	str x21,[sp, #0x20]
00aaed88	bl 0x00c34de0
00aaed8c	cbz x0,0x00aaed98
00aaed90	ldr x8,[x0, #0x8]
00aaed94	b 0x00aaedd4
00aaed98	adrp x1,0x76e000
00aaed9c	adrp x4,0xaaf000
00aaeda0	add x1,x1,#0xa44
00aaeda4	add x4,x4,#0x34
00aaeda8	mov x0,sp
00aaedac	mov w2,#0x456
00aaedb0	mov w3,#0x4
00aaedb4	mov w5,wzr
00aaedb8	bl 0x00c3de50
00aaedbc	cbz x0,0x00aaede0
00aaedc0	ldr w8,[x0]
00aaedc4	adrp x10,0xc6d000
00aaedc8	mov w9,#0x28
00aaedcc	add x10,x10,#0xa58
00aaedd0	madd x8,x8,x9,x10
00aaedd4	add x8,x8,#0x10
00aaedd8	ldr w8,[x8]
00aaeddc	cbnz w8,0x00aaed04
00aaede0	adrp x8,0xcc9000
00aaede4	ldr w9,[x8, #0x15c]
00aaede8	add w10,w9,#0x1
00aaedec	str w10,[x8, #0x15c]
00aaedf0	str w9,[x21, #0x10]
00aaedf4	cbz w9,0x00aaed30
00aaedf8	mov x0,x21
00aaedfc	stp x20,x19,[x21]
00aaee00	bl 0x00aadc08
00aaee04	mov w19,w0
00aaee08	stp xzr,xzr,[x21]
00aaee0c	b 0x00aaed34
