; FUN_00c2c5cc @ 00c2c5cc
00c2c5cc	paciasp
00c2c5d0	stp x29,x30,[sp, #-0x60]!
00c2c5d4	str x27,[sp, #0x10]
00c2c5d8	stp x26,x25,[sp, #0x20]
00c2c5dc	stp x24,x23,[sp, #0x30]
00c2c5e0	stp x22,x21,[sp, #0x40]
00c2c5e4	stp x20,x19,[sp, #0x50]
00c2c5e8	mov x29,sp
00c2c5ec	mov x22,x1
00c2c5f0	mov x19,x3
00c2c5f4	mov x20,x0
00c2c5f8	ldr w21,[x22], #0x4
00c2c5fc	cmn w21,#0x1
00c2c600	b.eq 0x00c2c638
00c2c604	cbz x21,0x00c2c644
00c2c608	ldr w8,[x22]
00c2c60c	cbz w8,0x00c2c650
00c2c610	mov x24,x1
00c2c614	mov x25,x2
00c2c618	sub x1,x22,x8
00c2c61c	tbz w4,#0x0,0x00c2c65c
00c2c620	ldr x8,[x19]
00c2c624	cmp x8,x1
00c2c628	b.eq 0x00c2c66c
00c2c62c	adrp x0,0x2d6000
00c2c630	add x0,x0,#0xf19
00c2c634	b 0x00c2c744
00c2c638	ldur x21,[x1, #0x4]
00c2c63c	add x22,x1,#0xc
00c2c640	cbnz x21,0x00c2c608
00c2c644	adrp x0,0x2ac000
00c2c648	add x0,x0,#0xde2
00c2c64c	b 0x00c2c744
00c2c650	adrp x0,0x2ba000
00c2c654	add x0,x0,#0xcfa
00c2c658	b 0x00c2c744
00c2c65c	mov x0,x20
00c2c660	mov x2,x19
00c2c664	bl 0x00c2c764
00c2c668	cbnz x0,0x00c2c744
00c2c66c	ldrb w3,[x19, #0x18]
00c2c670	add x21,x22,x21
00c2c674	add x8,x22,#0x4
00c2c678	add x1,x29,#0x18
00c2c67c	mov x0,x20
00c2c680	mov x2,x21
00c2c684	mov x4,xzr
00c2c688	str x8,[x29, #0x18]
00c2c68c	bl 0x00c2e33c
00c2c690	ldrb w8,[x19, #0x18]
00c2c694	mov x22,x0
00c2c698	add x1,x29,#0x18
00c2c69c	mov x0,x20
00c2c6a0	mov x2,x21
00c2c6a4	mov x4,xzr
00c2c6a8	and w3,w8,#0xf
00c2c6ac	bl 0x00c2e33c
00c2c6b0	ldrb w9,[x19, #0x31]
00c2c6b4	mov x23,x0
00c2c6b8	str xzr,[x25, #0x28]
00c2c6bc	tbz w9,#0x0,0x00c2c724
00c2c6c0	add x0,x29,#0x18
00c2c6c4	mov x1,x21
00c2c6c8	bl 0x00c2e6c8
00c2c6cc	ldrb w8,[x19, #0x19]
00c2c6d0	ldr x27,[x29, #0x18]
00c2c6d4	cmp w8,#0xff
00c2c6d8	add x26,x27,x0
00c2c6dc	b.eq 0x00c2c728
00c2c6e0	add x1,x29,#0x18
00c2c6e4	and w3,w8,#0xf
00c2c6e8	mov x0,x20
00c2c6ec	mov x2,x21
00c2c6f0	mov x4,xzr
00c2c6f4	bl 0x00c2e33c
00c2c6f8	cbz x0,0x00c2c728
00c2c6fc	ldrb w3,[x19, #0x19]
00c2c700	add x1,x29,#0x18
00c2c704	mov x0,x20
00c2c708	mov x2,x21
00c2c70c	mov x4,xzr
00c2c710	str x27,[x29, #0x18]
00c2c714	bl 0x00c2e33c
00c2c718	mov x8,x25
00c2c71c	str x0,[x25, #0x28]
00c2c720	b 0x00c2c72c
00c2c724	ldr x26,[x29, #0x18]
00c2c728	mov x8,x25
00c2c72c	sub x9,x21,x24
00c2c730	mov x0,xzr
00c2c734	stp x26,x22,[x8, #0x10]
00c2c738	stp x24,x9,[x8]
00c2c73c	add x9,x23,x22
00c2c740	str x9,[x8, #0x20]
00c2c744	ldp x20,x19,[sp, #0x50]
00c2c748	ldr x27,[sp, #0x10]
00c2c74c	ldp x22,x21,[sp, #0x40]
00c2c750	ldp x24,x23,[sp, #0x30]
00c2c754	ldp x26,x25,[sp, #0x20]
00c2c758	ldp x29,x30,[sp], #0x60
00c2c75c	autiasp
00c2c760	ret
