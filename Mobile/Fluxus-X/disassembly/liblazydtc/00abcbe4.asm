; PKCS12_SAFEBAG_create_pkcs8_encrypt_ex @ 00abcbe4
00abcbe4	sub sp,sp,#0x80
00abcbe8	stp x29,x30,[sp, #0x70]
00abcbec	add x29,sp,#0x70
00abcbf0	stp x28,x27,[sp, #0x20]
00abcbf4	ldr x27,[x29, #0x10]
00abcbf8	stp x26,x25,[sp, #0x30]
00abcbfc	stp x24,x23,[sp, #0x40]
00abcc00	stp x22,x21,[sp, #0x50]
00abcc04	stp x20,x19,[sp, #0x60]
00abcc08	mov x24,x7
00abcc0c	str x6,[sp, #0x18]
00abcc10	mov w21,w5
00abcc14	mov w20,w4
00abcc18	mov x23,x3
00abcc1c	mov w25,w2
00abcc20	mov x26,x1
00abcc24	mov w28,w0
00abcc28	bl 0x00c35250
00abcc2c	mov w0,w28
00abcc30	bl 0x00c324f0
00abcc34	mov x1,x0
00abcc38	mov x0,x24
00abcc3c	mov x2,x27
00abcc40	bl 0x00c35260
00abcc44	mov x22,x0
00abcc48	mov x19,x0
00abcc4c	cbnz x0,0x00abcc60
00abcc50	mov w0,w28
00abcc54	bl 0x00c324f0
00abcc58	bl 0x00c35300
00abcc5c	mov x19,x0
00abcc60	bl 0x00c35240
00abcc64	ldr x7,[sp, #0x18]
00abcc68	cmp x19,#0x0
00abcc6c	csinv w0,w28,wzr,eq
00abcc70	mov x1,x19
00abcc74	mov x2,x26
00abcc78	mov w3,w25
00abcc7c	mov x4,x23
00abcc80	mov w5,w20
00abcc84	mov w6,w21
00abcc88	stp x24,x27,[sp]
00abcc8c	bl 0x00c3f5e0
00abcc90	cbz x0,0x00abccb4
00abcc94	mov x20,x0
00abcc98	bl 0x00c3f420
00abcc9c	mov x21,x0
00abcca0	cbz x0,0x00abccbc
00abcca4	mov w0,#0x97
00abcca8	bl 0x00c37740
00abccac	stp x0,x20,[x21]
00abccb0	b 0x00abccf4
00abccb4	mov x21,xzr
00abccb8	b 0x00abccf4
00abccbc	bl 0x00c342a0
00abccc0	adrp x0,0x2a8000
00abccc4	adrp x2,0x2c0000
00abccc8	add x0,x0,#0x6fe
00abcccc	add x2,x2,#0x440
00abccd0	mov w1,#0xc1
00abccd4	bl 0x00c342b0
00abccd8	mov w1,#0x100
00abccdc	mov w0,#0x23
00abcce0	movk w1,#0xc, LSL #16
00abcce4	mov x2,xzr
00abcce8	bl 0x00c342c0
00abccec	mov x0,x20
00abccf0	bl 0x00c382f0
00abccf4	mov x0,x22
00abccf8	bl 0x00c357d0
00abccfc	mov x0,x21
00abcd00	ldp x29,x30,[sp, #0x70]
00abcd04	ldp x20,x19,[sp, #0x60]
00abcd08	ldp x22,x21,[sp, #0x50]
00abcd0c	ldp x24,x23,[sp, #0x40]
00abcd10	ldp x26,x25,[sp, #0x30]
00abcd14	ldp x28,x27,[sp, #0x20]
00abcd18	add sp,sp,#0x80
00abcd1c	ret
