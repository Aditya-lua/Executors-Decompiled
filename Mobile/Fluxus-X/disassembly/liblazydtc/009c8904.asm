; srp_generate_server_master_secret @ 009c8904
009c8904	str x23,[sp, #-0x40]!
009c8908	stp x22,x21,[sp, #0x10]
009c890c	stp x20,x19,[sp, #0x20]
009c8910	stp x29,x30,[sp, #0x30]
009c8914	mov x20,x0
009c8918	ldr x0,[x0, #0xc18]
009c891c	ldr x1,[x20, #0xbf8]
009c8920	add x29,sp,#0x30
009c8924	bl 0x00c36a30
009c8928	cbz w0,0x009c89d0
009c892c	ldr x8,[x20, #0x9a8]
009c8930	ldr x0,[x20, #0xc18]
009c8934	ldr x1,[x20, #0xc10]
009c8938	ldr x2,[x20, #0xbf8]
009c893c	ldr x3,[x8]
009c8940	ldr x4,[x8, #0x440]
009c8944	bl 0x00c36a10
009c8948	mov x19,x0
009c894c	cbz x0,0x009c89dc
009c8950	ldr x0,[x20, #0xc18]
009c8954	ldr x1,[x20, #0xc30]
009c8958	ldr x3,[x20, #0xc28]
009c895c	ldr x4,[x20, #0xbf8]
009c8960	mov x2,x19
009c8964	bl 0x00c36a00
009c8968	mov x21,x0
009c896c	cbz x0,0x009c8a18
009c8970	mov x0,x21
009c8974	bl 0x00c322f0
009c8978	add w8,w0,#0x7
009c897c	add w9,w0,#0xe
009c8980	cmp w8,#0x0
009c8984	csel w8,w9,w8,lt
009c8988	sbfx x22,x8,#0x3,#0x1d
009c898c	adrp x1,0x2af000
009c8990	add x1,x1,#0xb86
009c8994	mov w2,#0x13d
009c8998	mov x0,x22
009c899c	bl 0x00c32320
009c89a0	cbz x0,0x009c89e4
009c89a4	mov x23,x0
009c89a8	mov x0,x21
009c89ac	mov x1,x23
009c89b0	bl 0x00c36980
009c89b4	mov w3,#0x1
009c89b8	mov x0,x20
009c89bc	mov x1,x23
009c89c0	mov x2,x22
009c89c4	bl 0x00c349b0
009c89c8	mov w20,w0
009c89cc	b 0x009c8a1c
009c89d0	mov x21,xzr
009c89d4	mov x19,xzr
009c89d8	b 0x009c8a18
009c89dc	mov x21,xzr
009c89e0	b 0x009c8a18
009c89e4	bl 0x00c342a0
009c89e8	adrp x0,0x2af000
009c89ec	adrp x2,0x2bd000
009c89f0	add x0,x0,#0xb86
009c89f4	add x2,x2,#0x67d
009c89f8	mov w1,#0x13e
009c89fc	bl 0x00c342b0
009c8a00	mov w2,#0x100
009c8a04	mov w1,#0x50
009c8a08	movk w2,#0xc, LSL #16
009c8a0c	mov x0,x20
009c8a10	mov x3,xzr
009c8a14	bl 0x00c34410
009c8a18	mov w20,wzr
009c8a1c	mov x0,x21
009c8a20	bl 0x00c322e0
009c8a24	mov x0,x19
009c8a28	bl 0x00c322e0
009c8a2c	mov w0,w20
009c8a30	ldp x29,x30,[sp, #0x30]
009c8a34	ldp x20,x19,[sp, #0x20]
009c8a38	ldp x22,x21,[sp, #0x10]
009c8a3c	ldr x23,[sp], #0x40
009c8a40	ret
