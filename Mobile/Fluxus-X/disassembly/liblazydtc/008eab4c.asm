; cpr::CurlHolder::~CurlHolder @ 008eab4c
008eab4c	str x19,[sp, #-0x20]!
008eab50	stp x29,x30,[sp, #0x10]
008eab54	add x29,sp,#0x10
008eab58	mov x19,x0
008eab5c	ldr x0,[x0, #0x8]
008eab60	bl 0x00c31040
008eab64	ldr x0,[x19, #0x10]
008eab68	bl 0x00c31040
008eab6c	ldr x0,[x19, #0x18]
008eab70	bl 0x00c31030
008eab74	ldr x0,[x19]
008eab78	bl 0x00c30fe0
008eab7c	ldp x29,x30,[sp, #0x10]
008eab80	ldr x19,[sp], #0x20
008eab84	ret
