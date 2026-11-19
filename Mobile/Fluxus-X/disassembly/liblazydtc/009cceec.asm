; SSL3_RECORD_clear @ 009cceec
009cceec	str x21,[sp, #-0x30]!
009ccef0	stp x20,x19,[sp, #0x10]
009ccef4	stp x29,x30,[sp, #0x20]
009ccef8	add x29,sp,#0x20
009ccefc	cbz x1,0x009ccf28
009ccf00	mov x19,x1
009ccf04	add x20,x0,#0x30
009ccf08	mov x0,x20
009ccf0c	ldr x21,[x0], #-0x30
009ccf10	mov w2,#0x50
009ccf14	mov w1,wzr
009ccf18	bl 0x00c301c0
009ccf1c	subs x19,x19,#0x1
009ccf20	str x21,[x20], #0x50
009ccf24	b.ne 0x009ccf08
009ccf28	ldp x29,x30,[sp, #0x20]
009ccf2c	ldp x20,x19,[sp, #0x10]
009ccf30	ldr x21,[sp], #0x30
009ccf34	ret
