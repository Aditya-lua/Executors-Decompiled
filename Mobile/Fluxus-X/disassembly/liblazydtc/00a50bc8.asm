; ENGINE_set_default_string @ 00a50bc8
00a50bc8	sub sp,sp,#0x30
00a50bcc	stp x20,x19,[sp, #0x10]
00a50bd0	mov x19,x1
00a50bd4	adrp x3,0xa50000
00a50bd8	mov x20,x0
00a50bdc	add x3,x3,#0xc5c
00a50be0	mov w1,#0x2c
00a50be4	mov w2,#0x1
00a50be8	add x4,sp,#0xc
00a50bec	mov x0,x19
00a50bf0	stp x29,x30,[sp, #0x20]
00a50bf4	add x29,sp,#0x20
00a50bf8	str wzr,[sp, #0xc]
00a50bfc	bl 0x00c35230
00a50c00	cbz w0,0x00a50c14
00a50c04	ldr w1,[sp, #0xc]
00a50c08	mov x0,x20
00a50c0c	bl 0x00a50b14
00a50c10	b 0x00a50c4c
00a50c14	bl 0x00c342a0
00a50c18	adrp x0,0x2b9000
00a50c1c	adrp x2,0x2c9000
00a50c20	add x0,x0,#0xd12
00a50c24	add x2,x2,#0x7f7
00a50c28	mov w1,#0x56
00a50c2c	bl 0x00c342b0
00a50c30	adrp x2,0x2cf000
00a50c34	add x2,x2,#0xaee
00a50c38	mov w0,#0x26
00a50c3c	mov w1,#0x96
00a50c40	mov x3,x19
00a50c44	bl 0x00c342c0
00a50c48	mov w0,wzr
00a50c4c	ldp x29,x30,[sp, #0x20]
00a50c50	ldp x20,x19,[sp, #0x10]
00a50c54	add sp,sp,#0x30
00a50c58	ret
