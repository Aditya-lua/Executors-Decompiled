; FUN_00afecc4 @ 00afecc4
00afecc4	sub sp,sp,#0x80
00afecc8	stp x22,x21,[sp, #0x50]
00afeccc	mov x22,x0
00afecd0	adrp x0,0xc80000
00afecd4	add x0,x0,#0x7e0
00afecd8	stp x28,x27,[sp, #0x20]
00afecdc	stp x26,x25,[sp, #0x30]
00afece0	stp x24,x23,[sp, #0x40]
00afece4	stp x20,x19,[sp, #0x60]
00afece8	stp x29,x30,[sp, #0x70]
00afecec	add x29,sp,#0x70
00afecf0	mov x20,x2
00afecf4	mov x21,x1
00afecf8	bl 0x00c372e0
00afecfc	mov x19,x0
00afed00	cbz x0,0x00afee00
00afed04	mov x0,x20
00afed08	bl 0x00c325e0
00afed0c	cmp w0,#0x1
00afed10	b.lt 0x00afee58
00afed14	adrp x26,0xc80000
00afed18	mov w23,wzr
00afed1c	add x24,x19,#0x8
00afed20	add x26,x26,#0x7a8
00afed24	mov x0,x20
00afed28	mov w1,w23
00afed2c	bl 0x00c32610
00afed30	ldr x28,[x0, #0x8]
00afed34	adrp x1,0x2d6000
00afed38	mov x27,x0
00afed3c	mov w2,#0x9
00afed40	mov x0,x28
00afed44	add x1,x1,#0x6c2
00afed48	bl 0x00c31bb0
00afed4c	cbz w0,0x00afed7c
00afed50	adrp x1,0x2b0000
00afed54	mov w2,#0x8
00afed58	mov x0,x28
00afed5c	add x1,x1,#0x9a2
00afed60	bl 0x00c31bb0
00afed64	cbnz w0,0x00afee7c
00afed68	ldrb w8,[x28, #0x8]
00afed6c	cbz w8,0x00afee7c
00afed70	mov w8,#0x9
00afed74	mov x25,x24
00afed78	b 0x00afed8c
00afed7c	ldrb w8,[x28, #0x9]
00afed80	cbz w8,0x00afed50
00afed84	mov w8,#0xa
00afed88	mov x25,x19
00afed8c	add x8,x28,x8
00afed90	str x8,[sp, #0x10]
00afed94	ldr x8,[x27, #0x10]
00afed98	mov x0,x26
00afed9c	str x8,[sp, #0x18]
00afeda0	bl 0x00c372e0
00afeda4	mov x27,x0
00afeda8	cbz x0,0x00afee04
00afedac	ldr x0,[x27]
00afedb0	add x3,sp,#0x8
00afedb4	mov w4,#0x1
00afedb8	mov x1,x22
00afedbc	mov x2,x21
00afedc0	bl 0x00c40860
00afedc4	cbz x0,0x00afee34
00afedc8	ldr x0,[x25]
00afedcc	cbnz x0,0x00afeddc
00afedd0	bl 0x00c34780
00afedd4	str x0,[x25]
00afedd8	cbz x0,0x00afee04
00afeddc	mov x1,x27
00afede0	bl 0x00c347a0
00afede4	cbz w0,0x00afee04
00afede8	mov x0,x20
00afedec	add w23,w23,#0x1
00afedf0	bl 0x00c325e0
00afedf4	cmp w23,w0
00afedf8	b.lt 0x00afed24
00afedfc	b 0x00afee58
00afee00	mov x27,xzr
00afee04	bl 0x00c342a0
00afee08	adrp x0,0x2bc000
00afee0c	adrp x2,0x2dc000
00afee10	add x0,x0,#0x5f4
00afee14	add x2,x2,#0xaaf
00afee18	mov w1,#0xa5
00afee1c	bl 0x00c342b0
00afee20	mov w1,#0x100
00afee24	mov w0,#0x22
00afee28	movk w1,#0xc, LSL #16
00afee2c	mov x2,xzr
00afee30	bl 0x00c342c0
00afee34	adrp x1,0xc80000
00afee38	add x1,x1,#0x7e0
00afee3c	mov x0,x19
00afee40	bl 0x00c36160
00afee44	adrp x1,0xc80000
00afee48	add x1,x1,#0x7a8
00afee4c	mov x0,x27
00afee50	bl 0x00c36160
00afee54	mov x19,xzr
00afee58	mov x0,x19
00afee5c	ldp x29,x30,[sp, #0x70]
00afee60	ldp x20,x19,[sp, #0x60]
00afee64	ldp x22,x21,[sp, #0x50]
00afee68	ldp x24,x23,[sp, #0x40]
00afee6c	ldp x26,x25,[sp, #0x30]
00afee70	ldp x28,x27,[sp, #0x20]
00afee74	add sp,sp,#0x80
00afee78	ret
00afee7c	bl 0x00c342a0
00afee80	adrp x0,0x2bc000
00afee84	adrp x2,0x2dc000
00afee88	add x0,x0,#0x5f4
00afee8c	add x2,x2,#0xaaf
00afee90	mov w1,#0x92
00afee94	bl 0x00c342b0
00afee98	mov w0,#0x22
00afee9c	mov w1,#0x8f
00afeea0	mov x2,xzr
00afeea4	bl 0x00c342c0
00afeea8	mov x27,xzr
00afeeac	b 0x00afee34
