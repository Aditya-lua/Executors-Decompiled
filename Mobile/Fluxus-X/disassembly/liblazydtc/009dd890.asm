; ossl_statem_client_max_message_size @ 009dd890
009dd890	ldr w9,[x0, #0x5c]
009dd894	mov x8,x0
009dd898	mov x0,xzr
009dd89c	sub w9,w9,#0x2
009dd8a0	cmp w9,#0x2b
009dd8a4	b.hi 0x009dd940
009dd8a8	adrp x10,0x74d000
009dd8ac	add x10,x10,#0x544
009dd8b0	ldrsw x9,[x10, x9, LSL #0x2]
009dd8b4	add x9,x9,x10
009dd8b8	br x9
009dd8bc	mov w0,#0x4000
009dd8c0	ret
009dd8c4	ldr x0,[x8, #0xa00]
009dd8c8	ret
009dd8cc	mov w0,#0x9000
009dd8d0	movk w0,#0x1, LSL #16
009dd8d4	ret
009dd8d8	ldr x0,[x8, #0xa00]
009dd8dc	ret
009dd8e0	mov w0,#0x4e20
009dd8e4	ret
009dd8e8	mov w0,#0x1
009dd8ec	b 0x009dd940
009dd8f0	mov w0,#0x102
009dd8f4	ret
009dd8f8	mov w8,#0x5
009dd8fc	movk w8,#0x1, LSL #16
009dd900	add x0,x8,#0x42
009dd904	ret
009dd908	ldr x8,[x8, #0x8]
009dd90c	mov w0,#0x5
009dd910	movk w0,#0x1, LSL #16
009dd914	ldr x9,[x8, #0xc0]
009dd918	ldrb w9,[x9, #0x60]
009dd91c	tbnz w9,#0x3,0x009dd940
009dd920	ldr w8,[x8]
009dd924	cmp w8,#0x304
009dd928	b.lt 0x009dd940
009dd92c	cmp w8,#0x10, LSL #12
009dd930	mov w8,#0x10a
009dd934	movk w8,#0x2, LSL #16
009dd938	csel x0,x0,x8,eq
009dd93c	ret
009dd940	ret
009dd944	ldr w8,[x8]
009dd948	cmp w8,#0x100
009dd94c	orr w8,wzr,#0x3
009dd950	csinc x0,x8,xzr,eq
009dd954	ret
009dd958	mov w0,#0x40
009dd95c	ret
