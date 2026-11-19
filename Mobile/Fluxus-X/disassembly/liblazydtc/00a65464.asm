; EVP_KEM_gettable_ctx_params @ 00a65464
00a65464	str x19,[sp, #-0x20]!
00a65468	stp x29,x30,[sp, #0x10]
00a6546c	add x29,sp,#0x10
00a65470	cbz x0,0x00a654a0
00a65474	ldr x8,[x0, #0x70]
00a65478	mov x19,x0
00a6547c	cbz x8,0x00a654a0
00a65480	ldr x0,[x19, #0x18]
00a65484	bl 0x00c3b680
00a65488	ldr x2,[x19, #0x70]
00a6548c	ldp x29,x30,[sp, #0x10]
00a65490	mov x1,x0
00a65494	mov x0,xzr
00a65498	ldr x19,[sp], #0x20
00a6549c	br x2
00a654a0	ldp x29,x30,[sp, #0x10]
00a654a4	mov x0,xzr
00a654a8	ldr x19,[sp], #0x20
00a654ac	ret
