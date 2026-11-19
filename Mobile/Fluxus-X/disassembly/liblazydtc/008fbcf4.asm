; cpr::CurlContainer<cpr::Pair>::Add @ 008fbcf4
008fbcf4	str x19,[sp, #-0x20]!
008fbcf8	stp x29,x30,[sp, #0x10]
008fbcfc	add x29,sp,#0x10
008fbd00	mov x19,x0
008fbd04	ldr x0,[x0, #0x10]
008fbd08	ldr x8,[x19, #0x18]
008fbd0c	cmp x0,x8
008fbd10	b.eq 0x008fbd30
008fbd14	bl 0x00c30f20
008fbd18	ldr x8,[x19, #0x10]
008fbd1c	add x8,x8,#0x30
008fbd20	str x8,[x19, #0x10]
008fbd24	ldp x29,x30,[sp, #0x10]
008fbd28	ldr x19,[sp], #0x20
008fbd2c	ret
008fbd30	ldp x29,x30,[sp, #0x10]
008fbd34	add x0,x19,#0x8
008fbd38	ldr x19,[sp], #0x20
008fbd3c	b 0x00c30f60
