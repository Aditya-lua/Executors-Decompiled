; cpr::Session::SetOption @ 008f2fb4
008f2fb4	str x21,[sp, #-0x30]!
008f2fb8	stp x20,x19,[sp, #0x10]
008f2fbc	stp x29,x30,[sp, #0x20]
008f2fc0	add x29,sp,#0x20
008f2fc4	mov x19,x0
008f2fc8	mov x20,x1
008f2fcc	ldr x1,[x19, #0x88]!
008f2fd0	sub x21,x19,#0x8
008f2fd4	mov x0,x21
008f2fd8	bl 0x00826780
008f2fdc	ldr x8,[x20]
008f2fe0	stur x8,[x19, #-0x8]
008f2fe4	mov x8,x20
008f2fe8	ldr x9,[x8, #0x8]!
008f2fec	str x9,[x19]
008f2ff0	ldr x10,[x8, #0x8]
008f2ff4	str x10,[x19, #0x8]
008f2ff8	cbz x10,0x008f300c
008f2ffc	str x19,[x9, #0x10]
008f3000	str x8,[x20]
008f3004	stp xzr,xzr,[x8]
008f3008	b 0x008f3010
008f300c	str x19,[x21]
008f3010	ldp x29,x30,[sp, #0x20]
008f3014	ldp x20,x19,[sp, #0x10]
008f3018	ldr x21,[sp], #0x30
008f301c	ret
