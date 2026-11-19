; UI_dup_input_boolean @ 00aedeb0
00aedeb0	str x25,[sp, #-0x50]!
00aedeb4	stp x24,x23,[sp, #0x10]
00aedeb8	stp x22,x21,[sp, #0x20]
00aedebc	stp x20,x19,[sp, #0x30]
00aedec0	mov x21,x6
00aedec4	mov w22,w5
00aedec8	mov x25,x4
00aedecc	mov x23,x3
00aeded0	mov x20,x2
00aeded4	mov x24,x0
00aeded8	stp x29,x30,[sp, #0x40]
00aededc	add x29,sp,#0x40
00aedee0	cbz x1,0x00aedf0c
00aedee4	adrp x8,0x2a0000
00aedee8	add x8,x8,#0xc2f
00aedeec	mov w2,#0x10f
00aedef0	mov x0,x1
00aedef4	mov x1,x8
00aedef8	bl 0x00c34600
00aedefc	mov x19,x0
00aedf00	cbz x0,0x00aedf8c
00aedf04	cbnz x20,0x00aedf14
00aedf08	b 0x00aedf30
00aedf0c	mov x19,xzr
00aedf10	cbz x20,0x00aedf30
00aedf14	adrp x1,0x2a0000
00aedf18	add x1,x1,#0xc2f
00aedf1c	mov w2,#0x117
00aedf20	mov x0,x20
00aedf24	bl 0x00c34600
00aedf28	mov x20,x0
00aedf2c	cbz x0,0x00aedfc4
00aedf30	cbz x23,0x00aedf50
00aedf34	adrp x1,0x2a0000
00aedf38	add x1,x1,#0xc2f
00aedf3c	mov w2,#0x11f
00aedf40	mov x0,x23
00aedf44	bl 0x00c34600
00aedf48	mov x23,x0
00aedf4c	cbz x0,0x00aee034
00aedf50	cbz x25,0x00aedffc
00aedf54	adrp x1,0x2a0000
00aedf58	add x1,x1,#0xc2f
00aedf5c	mov w2,#0x127
00aedf60	mov x0,x25
00aedf64	bl 0x00c34600
00aedf68	mov x4,x0
00aedf6c	cbnz x0,0x00aee000
00aedf70	bl 0x00c342a0
00aedf74	adrp x0,0x2a0000
00aedf78	adrp x2,0x2d2000
00aedf7c	add x0,x0,#0xc2f
00aedf80	add x2,x2,#0x356
00aedf84	mov w1,#0x129
00aedf88	b 0x00aee04c
00aedf8c	bl 0x00c342a0
00aedf90	adrp x0,0x2a0000
00aedf94	adrp x2,0x2d2000
00aedf98	add x0,x0,#0xc2f
00aedf9c	add x2,x2,#0x356
00aedfa0	mov w1,#0x111
00aedfa4	bl 0x00c342b0
00aedfa8	mov w1,#0x100
00aedfac	mov w0,#0x28
00aedfb0	movk w1,#0xc, LSL #16
00aedfb4	mov x2,xzr
00aedfb8	bl 0x00c342c0
00aedfbc	mov x20,xzr
00aedfc0	b 0x00aedff4
00aedfc4	bl 0x00c342a0
00aedfc8	adrp x0,0x2a0000
00aedfcc	adrp x2,0x2d2000
00aedfd0	add x0,x0,#0xc2f
00aedfd4	add x2,x2,#0x356
00aedfd8	mov w1,#0x119
00aedfdc	bl 0x00c342b0
00aedfe0	mov w1,#0x100
00aedfe4	mov w0,#0x28
00aedfe8	movk w1,#0xc, LSL #16
00aedfec	mov x2,xzr
00aedff0	bl 0x00c342c0
00aedff4	mov x23,xzr
00aedff8	b 0x00aee064
00aedffc	mov x4,xzr
00aee000	mov x0,x24
00aee004	mov x1,x19
00aee008	mov x2,x20
00aee00c	mov x3,x23
00aee010	mov w6,w22
00aee014	mov x7,x21
00aee018	ldp x29,x30,[sp, #0x40]
00aee01c	ldp x20,x19,[sp, #0x30]
00aee020	ldp x22,x21,[sp, #0x20]
00aee024	ldp x24,x23,[sp, #0x10]
00aee028	mov w5,#0x1
00aee02c	ldr x25,[sp], #0x50
00aee030	b 0x00aedd28
00aee034	bl 0x00c342a0
00aee038	adrp x0,0x2a0000
00aee03c	adrp x2,0x2d2000
00aee040	add x0,x0,#0xc2f
00aee044	add x2,x2,#0x356
00aee048	mov w1,#0x121
00aee04c	bl 0x00c342b0
00aee050	mov w1,#0x100
00aee054	mov w0,#0x28
00aee058	movk w1,#0xc, LSL #16
00aee05c	mov x2,xzr
00aee060	bl 0x00c342c0
00aee064	adrp x21,0x2a0000
00aee068	add x21,x21,#0xc2f
00aee06c	mov w2,#0x132
00aee070	mov x0,x19
00aee074	mov x1,x21
00aee078	bl 0x00c32310
00aee07c	mov w2,#0x133
00aee080	mov x0,x20
00aee084	mov x1,x21
00aee088	bl 0x00c32310
00aee08c	mov w2,#0x134
00aee090	mov x0,x23
00aee094	mov x1,x21
00aee098	bl 0x00c32310
00aee09c	mov w2,#0x135
00aee0a0	mov x0,xzr
00aee0a4	mov x1,x21
00aee0a8	bl 0x00c32310
00aee0ac	ldp x29,x30,[sp, #0x40]
00aee0b0	ldp x20,x19,[sp, #0x30]
00aee0b4	ldp x22,x21,[sp, #0x20]
00aee0b8	ldp x24,x23,[sp, #0x10]
00aee0bc	mov w0,#0xffffffff
00aee0c0	ldr x25,[sp], #0x50
00aee0c4	ret
