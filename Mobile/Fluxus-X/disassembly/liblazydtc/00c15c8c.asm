; FUN_00c15c8c @ 00c15c8c
00c15c8c	paciasp
00c15c90	stp x29,x30,[sp, #-0x40]!
00c15c94	str x23,[sp, #0x10]
00c15c98	stp x22,x21,[sp, #0x20]
00c15c9c	stp x20,x19,[sp, #0x30]
00c15ca0	mov x29,sp
00c15ca4	ldp x21,x8,[x0, #0x8]
00c15ca8	cmp x21,x8
00c15cac	b.ne 0x00c15d38
00c15cb0	mov x8,x0
00c15cb4	mov x22,x1
00c15cb8	mov x23,x0
00c15cbc	ldr x20,[x8], #0x18
00c15cc0	sub x19,x21,x20
00c15cc4	cmp x20,x8
00c15cc8	lsl x1,x19,#0x1
00c15ccc	b.eq 0x00c15cec
00c15cd0	mov x0,x20
00c15cd4	bl 0x00c30950
00c15cd8	mov x8,x0
00c15cdc	mov x0,x23
00c15ce0	str x8,[x23]
00c15ce4	cbnz x8,0x00c15d24
00c15ce8	bl 0x00c30b40
00c15cec	mov x0,x1
00c15cf0	bl 0x00c308d0
00c15cf4	cbz x0,0x00c15d5c
00c15cf8	mov x8,x0
00c15cfc	cmp x21,x20
00c15d00	b.eq 0x00c15d1c
00c15d04	mov x0,x8
00c15d08	mov x1,x20
00c15d0c	mov x2,x19
00c15d10	mov x21,x8
00c15d14	bl 0x00c2ff60
00c15d18	mov x8,x21
00c15d1c	mov x0,x23
00c15d20	str x8,[x23]
00c15d24	asr x9,x19,#0x2
00c15d28	add x21,x8,x19
00c15d2c	mov x1,x22
00c15d30	add x9,x8,x9, LSL #0x3
00c15d34	str x9,[x0, #0x10]
00c15d38	ldr x8,[x1]
00c15d3c	str x8,[x21], #0x8
00c15d40	str x21,[x0, #0x8]
00c15d44	ldp x20,x19,[sp, #0x30]
00c15d48	ldr x23,[sp, #0x10]
00c15d4c	ldp x22,x21,[sp, #0x20]
00c15d50	ldp x29,x30,[sp], #0x40
00c15d54	autiasp
00c15d58	ret
00c15d5c	bl 0x00c30b40
