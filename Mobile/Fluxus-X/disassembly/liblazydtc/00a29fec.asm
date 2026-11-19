; ossl_ec_GF2m_simple_point_init @ 00a29fec
00a29fec	str x19,[sp, #-0x20]!
00a29ff0	stp x29,x30,[sp, #0x10]
00a29ff4	add x29,sp,#0x10
00a29ff8	mov x19,x0
00a29ffc	bl 0x00c37710
00a2a000	str x0,[x19, #0x10]
00a2a004	bl 0x00c37710
00a2a008	str x0,[x19, #0x18]
00a2a00c	bl 0x00c37710
00a2a010	ldr x8,[x19, #0x10]
00a2a014	str x0,[x19, #0x20]
00a2a018	cbz x8,0x00a2a030
00a2a01c	cbz x0,0x00a2a030
00a2a020	ldr x9,[x19, #0x18]
00a2a024	cbz x9,0x00a2a030
00a2a028	mov w0,#0x1
00a2a02c	b 0x00a2a04c
00a2a030	mov x0,x8
00a2a034	bl 0x00c36290
00a2a038	ldr x0,[x19, #0x18]
00a2a03c	bl 0x00c36290
00a2a040	ldr x0,[x19, #0x20]
00a2a044	bl 0x00c36290
00a2a048	mov w0,wzr
00a2a04c	ldp x29,x30,[sp, #0x10]
00a2a050	ldr x19,[sp], #0x20
00a2a054	ret
