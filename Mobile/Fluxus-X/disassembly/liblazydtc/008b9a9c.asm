; FUN_008b9a9c @ 008b9a9c
008b9a9c	stp x29,x30,[sp, #-0x30]!
008b9aa0	str x21,[sp, #0x10]
008b9aa4	stp x20,x19,[sp, #0x20]
008b9aa8	mov x29,sp
008b9aac	ldr x8,[x0, #0x60]
008b9ab0	mov x19,x2
008b9ab4	mov x20,x0
008b9ab8	mov x21,x1
008b9abc	ldr x8,[x8, #0x660]
008b9ac0	cbz x8,0x008b9ad0
008b9ac4	mov x0,xzr
008b9ac8	mov x1,x21
008b9acc	blr x8
008b9ad0	ldrsw x8,[x21, #0x44]
008b9ad4	ldr x1,[x21, #0x20]
008b9ad8	mov x0,x20
008b9adc	ldrb w3,[x21, #0x1]
008b9ae0	add x8,x8,x8, LSL #0x1
008b9ae4	lsl x2,x8,#0x4
008b9ae8	bl 0x008b7a9c
008b9aec	ldrsw x8,[x21, #0x40]
008b9af0	ldr x1,[x21, #0x58]
008b9af4	mov x0,x20
008b9af8	ldrb w3,[x21, #0x1]
008b9afc	lsl x2,x8,#0x4
008b9b00	bl 0x008b7a9c
008b9b04	ldrb w3,[x21, #0x1]
008b9b08	mov x0,x20
008b9b0c	mov x1,x21
008b9b10	mov w2,#0x88
008b9b14	mov x4,x19
008b9b18	ldp x20,x19,[sp, #0x20]
008b9b1c	ldr x21,[sp, #0x10]
008b9b20	ldp x29,x30,[sp], #0x30
008b9b24	b 0x008b7bd4
