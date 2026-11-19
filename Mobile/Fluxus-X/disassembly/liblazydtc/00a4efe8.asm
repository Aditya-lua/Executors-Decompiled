; OSSL_DECODER_names_do_all @ 00a4efe8
00a4efe8	str x21,[sp, #-0x30]!
00a4efec	stp x20,x19,[sp, #0x10]
00a4eff0	stp x29,x30,[sp, #0x20]
00a4eff4	add x29,sp,#0x20
00a4eff8	cbz x0,0x00a4f038
00a4effc	mov x21,x0
00a4f000	ldr x0,[x0]
00a4f004	cbz x0,0x00a4f034
00a4f008	mov x19,x2
00a4f00c	mov x20,x1
00a4f010	bl 0x00c3b2f0
00a4f014	bl 0x00c3b650
00a4f018	ldr w1,[x21, #0x8]
00a4f01c	mov x2,x20
00a4f020	mov x3,x19
00a4f024	ldp x29,x30,[sp, #0x20]
00a4f028	ldp x20,x19,[sp, #0x10]
00a4f02c	ldr x21,[sp], #0x30
00a4f030	b 0x00c3b610
00a4f034	mov w0,#0x1
00a4f038	ldp x29,x30,[sp, #0x20]
00a4f03c	ldp x20,x19,[sp, #0x10]
00a4f040	ldr x21,[sp], #0x30
00a4f044	ret
