; mbedtls_ecdh_compute_shared @ 00b9ae58
00b9ae58	sub sp,sp,#0x90
00b9ae5c	str x25,[sp, #0x40]
00b9ae60	stp x24,x23,[sp, #0x50]
00b9ae64	stp x22,x21,[sp, #0x60]
00b9ae68	stp x20,x19,[sp, #0x70]
00b9ae6c	stp x29,x30,[sp, #0x80]
00b9ae70	add x29,sp,#0x80
00b9ae74	mrs x25,tpidr_el0
00b9ae78	ldr x8,[x25, #0x28]
00b9ae7c	mov x24,x0
00b9ae80	add x0,sp,#0x8
00b9ae84	mov x20,x5
00b9ae88	mov x21,x4
00b9ae8c	mov x22,x3
00b9ae90	mov x23,x2
00b9ae94	mov x19,x1
00b9ae98	str x8,[sp, #0x38]
00b9ae9c	bl 0x00c42760
00b9aea0	add x1,sp,#0x8
00b9aea4	mov x0,x24
00b9aea8	mov x2,x22
00b9aeac	mov x3,x23
00b9aeb0	mov x4,x21
00b9aeb4	mov x5,x20
00b9aeb8	mov x6,xzr
00b9aebc	bl 0x00c42710
00b9aec0	mov w20,w0
00b9aec4	cbnz w0,0x00b9aeec
00b9aec8	add x0,sp,#0x8
00b9aecc	bl 0x00c426d0
00b9aed0	cbz w0,0x00b9aedc
00b9aed4	mov w20,#0xffffb080
00b9aed8	b 0x00b9aeec
00b9aedc	add x1,sp,#0x8
00b9aee0	mov x0,x19
00b9aee4	bl 0x00c41b60
00b9aee8	mov w20,w0
00b9aeec	add x0,sp,#0x8
00b9aef0	bl 0x00c42750
00b9aef4	ldr x8,[x25, #0x28]
00b9aef8	ldr x9,[sp, #0x38]
00b9aefc	cmp x8,x9
00b9af00	b.ne 0x00b9af24
00b9af04	mov w0,w20
00b9af08	ldp x29,x30,[sp, #0x80]
00b9af0c	ldp x20,x19,[sp, #0x70]
00b9af10	ldp x22,x21,[sp, #0x60]
00b9af14	ldp x24,x23,[sp, #0x50]
00b9af18	ldr x25,[sp, #0x40]
00b9af1c	add sp,sp,#0x90
00b9af20	ret
00b9af24	bl 0x00c2fec0
