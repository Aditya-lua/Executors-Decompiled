; cpr::Session::SetUnixSocket @ 008eeb64
008eeb64	str x19,[sp, #-0x20]!
008eeb68	stp x29,x30,[sp, #0x10]
008eeb6c	add x29,sp,#0x10
008eeb70	ldr x8,[x0, #0x18]
008eeb74	mov x0,x1
008eeb78	ldr x19,[x8]
008eeb7c	bl 0x00c313f0
008eeb80	ldp x29,x30,[sp, #0x10]
008eeb84	mov w1,#0x27f7
008eeb88	mov x2,x0
008eeb8c	mov x0,x19
008eeb90	ldr x19,[sp], #0x20
008eeb94	b 0x00c317c0
