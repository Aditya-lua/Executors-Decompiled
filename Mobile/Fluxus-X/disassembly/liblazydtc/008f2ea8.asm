; cpr::Session::SetOption @ 008f2ea8
008f2ea8	stp x20,x19,[sp, #-0x20]!
008f2eac	stp x29,x30,[sp, #0x10]
008f2eb0	add x29,sp,#0x10
008f2eb4	ldr x8,[x0, #0x18]
008f2eb8	mov x19,x0
008f2ebc	mov x20,x1
008f2ec0	mov w1,#0x6b
008f2ec4	ldr x0,[x8]
008f2ec8	mov w2,#0x40
008f2ecc	bl 0x00c317c0
008f2ed0	ldr x8,[x19, #0x18]
008f2ed4	ldr x9,[x20]
008f2ed8	mov x0,x20
008f2edc	ldr x19,[x8]
008f2ee0	ldr x8,[x9, #0x10]
008f2ee4	blr x8
008f2ee8	ldp x29,x30,[sp, #0x10]
008f2eec	mov w1,#0x27ec
008f2ef0	mov x2,x0
008f2ef4	mov x0,x19
008f2ef8	ldp x20,x19,[sp], #0x20
008f2efc	b 0x00c317c0
