; FUN_00c2c3fc @ 00c2c3fc
00c2c3fc	paciasp
00c2c400	stp x29,x30,[sp, #-0x30]!
00c2c404	str x21,[sp, #0x10]
00c2c408	stp x20,x19,[sp, #0x20]
00c2c40c	mov x29,sp
00c2c410	ldr x8,[x0]
00c2c414	mov x19,x2
00c2c418	mov x20,x0
00c2c41c	mov w21,w1
00c2c420	ldr x8,[x8, #0x10]
00c2c424	blr x8
00c2c428	tbz w0,#0x0,0x00c2c460
00c2c42c	ldr x8,[x20]
00c2c430	mov x0,x20
00c2c434	mov w1,w21
00c2c438	ldr x8,[x8, #0x18]
00c2c43c	blr x8
00c2c440	mov x8,x0
00c2c444	mov w0,wzr
00c2c448	str x8,[x19]
00c2c44c	ldp x20,x19,[sp, #0x20]
00c2c450	ldr x21,[sp, #0x10]
00c2c454	ldp x29,x30,[sp], #0x30
00c2c458	autiasp
00c2c45c	ret
00c2c460	mov w0,#0xffffe672
00c2c464	ldp x20,x19,[sp, #0x20]
00c2c468	ldr x21,[sp, #0x10]
00c2c46c	ldp x29,x30,[sp], #0x30
00c2c470	autiasp
00c2c474	ret
