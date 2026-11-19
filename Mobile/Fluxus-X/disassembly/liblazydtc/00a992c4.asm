; ossl_cleanup_thread @ 00a992c4
00a992c4	str x19,[sp, #-0x20]!
00a992c8	mov w1,#0x1
00a992cc	mov x0,xzr
00a992d0	stp x29,x30,[sp, #0x10]
00a992d4	add x29,sp,#0x10
00a992d8	bl 0x00a99300
00a992dc	adrp x19,0xcc9000
00a992e0	add x19,x19,#0x130
00a992e4	mov x0,x19
00a992e8	bl 0x00c38350
00a992ec	ldp x29,x30,[sp, #0x10]
00a992f0	mov x8,#-0x1
00a992f4	str x8,[x19]
00a992f8	ldr x19,[sp], #0x20
00a992fc	ret
