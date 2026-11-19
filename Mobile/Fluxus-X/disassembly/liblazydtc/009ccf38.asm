; SSL3_RECORD_release @ 009ccf38
009ccf38	str x21,[sp, #-0x30]!
009ccf3c	stp x20,x19,[sp, #0x10]
009ccf40	stp x29,x30,[sp, #0x20]
009ccf44	add x29,sp,#0x20
009ccf48	cbz x1,0x009ccf78
009ccf4c	adrp x20,0x2cf000
009ccf50	mov x19,x1
009ccf54	add x21,x0,#0x30
009ccf58	add x20,x20,#0x7d6
009ccf5c	ldr x0,[x21]
009ccf60	orr w2,wzr,#0x38
009ccf64	mov x1,x20
009ccf68	bl 0x00c32310
009ccf6c	subs x19,x19,#0x1
009ccf70	str xzr,[x21], #0x50
009ccf74	b.ne 0x009ccf5c
009ccf78	ldp x29,x30,[sp, #0x20]
009ccf7c	ldp x20,x19,[sp, #0x10]
009ccf80	ldr x21,[sp], #0x30
009ccf84	ret
