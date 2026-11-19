; ix::gzipCompress @ 0097b7d4
0097b7d4	str x28,[sp, #-0x50]!
0097b7d8	stp x24,x23,[sp, #0x10]
0097b7dc	stp x22,x21,[sp, #0x20]
0097b7e0	stp x20,x19,[sp, #0x30]
0097b7e4	stp x29,x30,[sp, #0x40]
0097b7e8	add x29,sp,#0x40
0097b7ec	sub sp,sp,#0x8, LSL #12
0097b7f0	sub sp,sp,#0x80
0097b7f4	mrs x21,tpidr_el0
0097b7f8	mov x19,x8
0097b7fc	ldr x8,[x21, #0x28]
0097b800	mov x20,x0
0097b804	mov x22,sp
0097b808	add x0,sp,#0x8
0097b80c	orr w2,wzr,#0x70
0097b810	mov w1,wzr
0097b814	str x8,[x22]
0097b818	bl 0x00c301c0
0097b81c	adrp x6,0x2a3000
0097b820	add x6,x6,#0x6b5
0097b824	add x0,sp,#0x8
0097b828	mov w1,#0xffffffff
0097b82c	mov w2,#0x8
0097b830	orr w3,wzr,#0x1f
0097b834	mov w4,#0x8
0097b838	orr w7,wzr,#0x70
0097b83c	mov w5,wzr
0097b840	bl 0x00c33290
0097b844	ldrb w8,[x20]
0097b848	tbnz w8,#0x0,0x0097b85c
0097b84c	add x9,x20,#0x1
0097b850	lsr w8,w8,#0x1
0097b854	str x9,[sp, #0x8]
0097b858	b 0x0097b868
0097b85c	ldr x8,[x20, #0x10]
0097b860	str x8,[sp, #0x8]
0097b864	ldr x8,[x20, #0x8]
0097b868	add x23,sp,#0x78
0097b86c	mov w24,#0x8000
0097b870	str w8,[sp, #0x10]
0097b874	stp xzr,xzr,[x19]
0097b878	str xzr,[x19, #0x10]
0097b87c	str x23,[sp, #0x20]
0097b880	str w24,[sp, #0x28]
0097b884	add x0,sp,#0x8
0097b888	mov w1,#0x4
0097b88c	bl 0x00c33270
0097b890	ldrb w8,[x19]
0097b894	ldr x9,[x19, #0x8]
0097b898	ldr x10,[sp, #0x30]
0097b89c	mov w20,w0
0097b8a0	lsr w11,w8,#0x1
0097b8a4	tst w8,#0x1
0097b8a8	csel x8,x11,x9,eq
0097b8ac	subs x2,x10,x8
0097b8b0	b.ls 0x0097b8c0
0097b8b4	add x1,sp,#0x78
0097b8b8	mov x0,x19
0097b8bc	bl 0x00c308c0
0097b8c0	cbz w20,0x0097b87c
0097b8c4	add x0,sp,#0x8
0097b8c8	bl 0x00c33280
0097b8cc	ldr x8,[x21, #0x28]
0097b8d0	ldr x9,[x22]
0097b8d4	cmp x8,x9
0097b8d8	b.ne 0x0097b8fc
0097b8dc	add sp,sp,#0x8, LSL #12
0097b8e0	add sp,sp,#0x80
0097b8e4	ldp x29,x30,[sp, #0x40]
0097b8e8	ldp x20,x19,[sp, #0x30]
0097b8ec	ldp x22,x21,[sp, #0x20]
0097b8f0	ldp x24,x23,[sp, #0x10]
0097b8f4	ldr x28,[sp], #0x50
0097b8f8	ret
0097b8fc	bl 0x00c2fec0
