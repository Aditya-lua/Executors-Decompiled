; bn_mul_low_normal @ 00a0a5c8
00a0a5c8	str x23,[sp, #-0x40]!
00a0a5cc	stp x22,x21,[sp, #0x10]
00a0a5d0	stp x20,x19,[sp, #0x20]
00a0a5d4	stp x29,x30,[sp, #0x30]
00a0a5d8	mov w20,w3
00a0a5dc	ldr x3,[x2]
00a0a5e0	mov x21,x2
00a0a5e4	mov w2,w20
00a0a5e8	add x29,sp,#0x30
00a0a5ec	mov x19,x1
00a0a5f0	mov x22,x0
00a0a5f4	bl 0x00c38900
00a0a5f8	cmp w20,#0x2
00a0a5fc	b.lt 0x00a0a680
00a0a600	add w23,w20,#0x4
00a0a604	add x20,x22,#0x20
00a0a608	add x21,x21,#0x20
00a0a60c	ldur x3,[x21, #-0x18]
00a0a610	sub w2,w23,#0x5
00a0a614	sub x0,x20,#0x18
00a0a618	mov x1,x19
00a0a61c	bl 0x00c388d0
00a0a620	subs w2,w23,#0x6
00a0a624	b.eq 0x00a0a680
00a0a628	ldur x3,[x21, #-0x10]
00a0a62c	sub x0,x20,#0x10
00a0a630	mov x1,x19
00a0a634	sub w22,w23,#0x4
00a0a638	bl 0x00c388d0
00a0a63c	cmp w22,#0x4
00a0a640	b.lt 0x00a0a680
00a0a644	ldur x3,[x21, #-0x8]
00a0a648	sub w2,w23,#0x7
00a0a64c	sub x0,x20,#0x8
00a0a650	mov x1,x19
00a0a654	bl 0x00c388d0
00a0a658	subs w2,w23,#0x8
00a0a65c	b.eq 0x00a0a680
00a0a660	ldr x3,[x21], #0x20
00a0a664	mov x0,x20
00a0a668	mov x1,x19
00a0a66c	bl 0x00c388d0
00a0a670	cmp w22,#0x5
00a0a674	add x20,x20,#0x20
00a0a678	mov w23,w22
00a0a67c	b.gt 0x00a0a60c
00a0a680	ldp x29,x30,[sp, #0x30]
00a0a684	ldp x20,x19,[sp, #0x20]
00a0a688	ldp x22,x21,[sp, #0x10]
00a0a68c	ldr x23,[sp], #0x40
00a0a690	ret
