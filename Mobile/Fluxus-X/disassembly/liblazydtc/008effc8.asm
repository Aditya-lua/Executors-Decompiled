; cpr::Session::PrepareOptions @ 008effc8
008effc8	str x19,[sp, #-0x20]!
008effcc	stp x29,x30,[sp, #0x10]
008effd0	add x29,sp,#0x10
008effd4	ldr x8,[x0, #0x18]
008effd8	mov x19,x0
008effdc	mov w1,#0x2c
008effe0	mov x2,xzr
008effe4	ldr x0,[x8]
008effe8	bl 0x00c317c0
008effec	ldr x8,[x19, #0x18]
008efff0	adrp x2,0x2ab000
008efff4	add x2,x2,#0x4be
008efff8	mov w1,#0x2734
008efffc	ldr x0,[x8]
008f0000	bl 0x00c317c0
008f0004	ldp x29,x30,[sp, #0x10]
008f0008	mov x0,x19
008f000c	ldr x19,[sp], #0x20
008f0010	b 0x00c31270
