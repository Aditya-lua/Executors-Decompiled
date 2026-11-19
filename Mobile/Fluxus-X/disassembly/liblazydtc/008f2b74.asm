; cpr::Session::AddInterceptor @ 008f2b74
008f2b74	stp x20,x19,[sp, #-0x20]!
008f2b78	stp x29,x30,[sp, #0x10]
008f2b7c	add x29,sp,#0x10
008f2b80	ldr x10,[x0, #0x288]
008f2b84	ldr x9,[x0, #0x280]
008f2b88	ldr x11,[x0, #0x298]
008f2b8c	ldr x8,[x0, #0x2a0]
008f2b90	mov x19,x0
008f2b94	subs x12,x10,x9
008f2b98	lsl x12,x12,#0x5
008f2b9c	sub x12,x12,#0x1
008f2ba0	csel x12,xzr,x12,eq
008f2ba4	add x11,x8,x11
008f2ba8	cmp x12,x11
008f2bac	mov x20,x1
008f2bb0	b.ne 0x008f2bd0
008f2bb4	add x0,x19,#0x278
008f2bb8	bl 0x00c31610
008f2bbc	ldr x8,[x19, #0x2a0]
008f2bc0	ldr x11,[x19, #0x298]
008f2bc4	ldr x9,[x19, #0x280]
008f2bc8	ldr x10,[x19, #0x288]
008f2bcc	add x11,x11,x8
008f2bd0	cmp x10,x9
008f2bd4	b.eq 0x008f2bec
008f2bd8	lsr x10,x11,#0x5
008f2bdc	and x10,x10,#0x7fffffffffffff8
008f2be0	ldr x9,[x9, x10#0x0]
008f2be4	add x9,x9,w11, UXTB  #0x4
008f2be8	b 0x008f2bf0
008f2bec	mov x9,xzr
008f2bf0	ldr x10,[x20]
008f2bf4	str x10,[x9]
008f2bf8	ldr x10,[x20, #0x8]
008f2bfc	str x10,[x9, #0x8]
008f2c00	cbz x10,0x008f2c1c
008f2c04	add x8,x10,#0x8
008f2c08	ldxr x9,[x8]
008f2c0c	add x9,x9,#0x1
008f2c10	stxr w10,x9,[x8]
008f2c14	cbnz w10,0x008f2c08
008f2c18	ldr x8,[x19, #0x2a0]
008f2c1c	add x8,x8,#0x1
008f2c20	str x8,[x19, #0x2a0]
008f2c24	ldp x29,x30,[sp, #0x10]
008f2c28	ldp x20,x19,[sp], #0x20
008f2c2c	ret
