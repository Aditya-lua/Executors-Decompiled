; PEM_write_bio_PrivateKey_ex @ 00ab8694
00ab8694	stp x26,x25,[sp, #-0x50]!
00ab8698	stp x24,x23,[sp, #0x10]
00ab869c	stp x22,x21,[sp, #0x20]
00ab86a0	stp x20,x19,[sp, #0x30]
00ab86a4	stp x29,x30,[sp, #0x40]
00ab86a8	add x29,sp,#0x40
00ab86ac	mov w22,w4
00ab86b0	ldr x4,[x29, #0x10]
00ab86b4	mov x24,x3
00ab86b8	mov x25,x2
00ab86bc	mov x26,x1
00ab86c0	adrp x2,0x2b9000
00ab86c4	adrp x3,0x2a2000
00ab86c8	mov x20,x0
00ab86cc	add x2,x2,#0x56f
00ab86d0	add x3,x3,#0x154
00ab86d4	mov w1,#0x87
00ab86d8	mov x0,x26
00ab86dc	mov x19,x6
00ab86e0	mov x21,x5
00ab86e4	bl 0x00c3b960
00ab86e8	mov x23,x0
00ab86ec	bl 0x00c3b7d0
00ab86f0	cbz w0,0x00ab8774
00ab86f4	cbnz x24,0x00ab8714
00ab86f8	cbnz x21,0x00ab8714
00ab86fc	cbz x19,0x00ab87f8
00ab8700	mov x0,x19
00ab8704	bl 0x00c2ff50
00ab8708	mov x22,x0
00ab870c	mov x21,xzr
00ab8710	mov x24,x19
00ab8714	cbz x25,0x00ab8808
00ab8718	mov x0,x25
00ab871c	bl 0x00c3cef0
00ab8720	mov x1,x0
00ab8724	mov x0,x23
00ab8728	mov x2,xzr
00ab872c	bl 0x00c3b970
00ab8730	cbz w0,0x00ab8764
00ab8734	cbz x24,0x00ab874c
00ab8738	sxtw x2,w22
00ab873c	mov x0,x23
00ab8740	mov x1,x24
00ab8744	bl 0x00c3b980
00ab8748	cbz w0,0x00ab8764
00ab874c	cbz x21,0x00ab8808
00ab8750	mov x0,x23
00ab8754	mov x1,x21
00ab8758	mov x2,x19
00ab875c	bl 0x00c3b990
00ab8760	cbnz w0,0x00ab8808
00ab8764	mov x0,x23
00ab8768	bl 0x00c3b890
00ab876c	mov w0,wzr
00ab8770	b 0x00ab8824
00ab8774	mov x0,x23
00ab8778	bl 0x00c3b890
00ab877c	cbz x26,0x00ab87c4
00ab8780	ldr x8,[x26, #0x8]
00ab8784	cbz x8,0x00ab8790
00ab8788	ldr x8,[x8, #0x48]
00ab878c	cbz x8,0x00ab87c4
00ab8790	mov x0,x20
00ab8794	mov x3,x24
00ab8798	mov w4,w22
00ab879c	mov x5,x21
00ab87a0	mov x6,x19
00ab87a4	ldp x29,x30,[sp, #0x40]
00ab87a8	ldp x20,x19,[sp, #0x30]
00ab87ac	ldp x22,x21,[sp, #0x20]
00ab87b0	ldp x24,x23,[sp, #0x10]
00ab87b4	mov x1,x26
00ab87b8	mov x2,x25
00ab87bc	ldp x26,x25,[sp], #0x50
00ab87c0	b 0x00c3f290
00ab87c4	mov x0,x20
00ab87c8	mov x3,x24
00ab87cc	mov w4,w22
00ab87d0	mov x5,x21
00ab87d4	mov x6,x19
00ab87d8	ldp x29,x30,[sp, #0x40]
00ab87dc	ldp x20,x19,[sp, #0x30]
00ab87e0	ldp x22,x21,[sp, #0x20]
00ab87e4	ldp x24,x23,[sp, #0x10]
00ab87e8	mov x1,x26
00ab87ec	mov x2,x25
00ab87f0	ldp x26,x25,[sp], #0x50
00ab87f4	b 0x00ab883c
00ab87f8	adrp x21,0xcb5000
00ab87fc	ldr x21,[x21, #0x750]
00ab8800	mov x24,xzr
00ab8804	cbnz x25,0x00ab8718
00ab8808	mov x0,x23
00ab880c	mov x1,x20
00ab8810	bl 0x00c3b860
00ab8814	mov w19,w0
00ab8818	mov x0,x23
00ab881c	bl 0x00c3b890
00ab8820	mov w0,w19
00ab8824	ldp x29,x30,[sp, #0x40]
00ab8828	ldp x20,x19,[sp, #0x30]
00ab882c	ldp x22,x21,[sp, #0x20]
00ab8830	ldp x24,x23,[sp, #0x10]
00ab8834	ldp x26,x25,[sp], #0x50
00ab8838	ret
