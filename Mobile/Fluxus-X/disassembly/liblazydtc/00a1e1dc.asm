; BN_generate_dsa_nonce @ 00a1e1dc
00a1e1dc	stp x20,x19,[sp, #-0x20]!
00a1e1e0	stp x29,x30,[sp, #0x10]
00a1e1e4	add x29,sp,#0x10
00a1e1e8	mov x19,x0
00a1e1ec	bl 0x00a1ded4
00a1e1f0	mov w20,w0
00a1e1f4	mov x0,x19
00a1e1f8	bl 0x00c38e40
00a1e1fc	ldp x29,x30,[sp, #0x10]
00a1e200	mov w0,w20
00a1e204	ldp x20,x19,[sp], #0x20
00a1e208	ret
