; OPENSSL_LH_doall_arg @ 00a8037c
00a8037c	str x23,[sp, #-0x40]!
00a80380	stp x22,x21,[sp, #0x10]
00a80384	stp x20,x19,[sp, #0x20]
00a80388	stp x29,x30,[sp, #0x30]
00a8038c	add x29,sp,#0x30
00a80390	cbz x0,0x00a803d8
00a80394	ldr w8,[x0, #0x18]
00a80398	mov x21,x0
00a8039c	subs w8,w8,#0x1
00a803a0	b.mi 0x00a803d8
00a803a4	mov x19,x2
00a803a8	mov x20,x1
00a803ac	sxtw x22,w8
00a803b0	ldr x8,[x21]
00a803b4	ldr x8,[x8, x22, LSL #0x3]
00a803b8	cbz x8,0x00a803d0
00a803bc	ldp x0,x23,[x8]
00a803c0	mov x1,x19
00a803c4	blr x20
00a803c8	mov x8,x23
00a803cc	cbnz x23,0x00a803bc
00a803d0	sub x22,x22,#0x1
00a803d4	tbz w22,#0x1f,0x00a803b0
00a803d8	ldp x29,x30,[sp, #0x30]
00a803dc	ldp x20,x19,[sp, #0x20]
00a803e0	ldp x22,x21,[sp, #0x10]
00a803e4	ldr x23,[sp], #0x40
00a803e8	ret
