; ENGINE_get_pkey_asn1_meth_str @ 00a5295c
00a5295c	sub sp,sp,#0x60
00a52960	stp x24,x23,[sp, #0x20]
00a52964	stp x22,x21,[sp, #0x30]
00a52968	stp x20,x19,[sp, #0x40]
00a5296c	stp x29,x30,[sp, #0x50]
00a52970	ldr x22,[x0, #0x50]
00a52974	mov w21,w2
00a52978	str x25,[sp, #0x10]
00a5297c	add x29,sp,#0x50
00a52980	cbz x22,0x00a52a20
00a52984	mov x19,x0
00a52988	mov x20,x1
00a5298c	cmn w21,#0x1
00a52990	b.ne 0x00a529a0
00a52994	mov x0,x20
00a52998	bl 0x00c2ff50
00a5299c	mov x21,x0
00a529a0	add x2,sp,#0x18
00a529a4	mov x0,x19
00a529a8	mov x1,xzr
00a529ac	mov w3,wzr
00a529b0	blr x22
00a529b4	cmp w0,#0x1
00a529b8	b.lt 0x00a52a20
00a529bc	mov x24,xzr
00a529c0	sxtw x22,w21
00a529c4	sxtw x25,w0
00a529c8	ldr x8,[sp, #0x18]
00a529cc	ldr x9,[x19, #0x50]
00a529d0	add x1,sp,#0x8
00a529d4	mov x0,x19
00a529d8	ldr w3,[x8, x24, LSL #0x2]
00a529dc	mov x2,xzr
00a529e0	blr x9
00a529e4	ldr x8,[sp, #0x8]
00a529e8	cbz x8,0x00a52a14
00a529ec	ldr x23,[x8, #0x10]
00a529f0	mov x0,x23
00a529f4	bl 0x00c2ff50
00a529f8	cmp w21,w0
00a529fc	b.ne 0x00a52a14
00a52a00	mov x0,x23
00a52a04	mov x1,x20
00a52a08	mov x2,x22
00a52a0c	bl 0x00c35ef0
00a52a10	cbz w0,0x00a52a40
00a52a14	add x24,x24,#0x1
00a52a18	cmp x24,x25
00a52a1c	b.lt 0x00a529c8
00a52a20	mov x0,xzr
00a52a24	ldp x29,x30,[sp, #0x50]
00a52a28	ldp x20,x19,[sp, #0x40]
00a52a2c	ldp x22,x21,[sp, #0x30]
00a52a30	ldp x24,x23,[sp, #0x20]
00a52a34	ldr x25,[sp, #0x10]
00a52a38	add sp,sp,#0x60
00a52a3c	ret
00a52a40	ldr x0,[sp, #0x8]
00a52a44	b 0x00a52a24
