; UI_ctrl @ 00aeeb98
00aeeb98	stp x29,x30,[sp, #-0x10]!
00aeeb9c	mov x29,sp
00aeeba0	cbz x0,0x00aeebdc
00aeeba4	mov x8,x0
00aeeba8	cmp w1,#0x2
00aeebac	b.eq 0x00aeec08
00aeebb0	cmp w1,#0x1
00aeebb4	b.ne 0x00aeec18
00aeebb8	ldr w9,[x8, #0x28]
00aeebbc	cmp x2,#0x0
00aeebc0	ubfx w0,w9,#0x8,#0x1
00aeebc4	and w10,w9,#0xfffffeff
00aeebc8	orr w9,w9,#0x100
00aeebcc	csel w9,w10,w9,eq
00aeebd0	str w9,[x8, #0x28]
00aeebd4	ldp x29,x30,[sp], #0x10
00aeebd8	ret
00aeebdc	bl 0x00c342a0
00aeebe0	adrp x0,0x2a0000
00aeebe4	adrp x2,0x2aa000
00aeebe8	add x0,x0,#0xc2f
00aeebec	add x2,x2,#0x9ef
00aeebf0	mov w1,#0x22b
00aeebf4	bl 0x00c342b0
00aeebf8	mov w1,#0x102
00aeebfc	mov w0,#0x28
00aeec00	movk w1,#0xc, LSL #16
00aeec04	b 0x00aeec3c
00aeec08	ldr w8,[x8, #0x28]
00aeec0c	and w0,w8,#0x1
00aeec10	ldp x29,x30,[sp], #0x10
00aeec14	ret
00aeec18	bl 0x00c342a0
00aeec1c	adrp x0,0x2a0000
00aeec20	adrp x2,0x2aa000
00aeec24	add x0,x0,#0xc2f
00aeec28	add x2,x2,#0x9ef
00aeec2c	mov w1,#0x23d
00aeec30	bl 0x00c342b0
00aeec34	mov w0,#0x28
00aeec38	mov w1,#0x6a
00aeec3c	mov x2,xzr
00aeec40	bl 0x00c342c0
00aeec44	mov w0,#0xffffffff
00aeec48	ldp x29,x30,[sp], #0x10
00aeec4c	ret
