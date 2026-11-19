; FUN_00a008d8 @ 00a008d8
00a008d8	str x23,[sp, #-0x40]!
00a008dc	stp x22,x21,[sp, #0x10]
00a008e0	stp x20,x19,[sp, #0x20]
00a008e4	stp x29,x30,[sp, #0x30]
00a008e8	ldrb w8,[x0, #0x31]
00a008ec	mov w19,w2
00a008f0	add x29,sp,#0x30
00a008f4	tbnz w8,#0x1,0x00a009a0
00a008f8	ldr x22,[x0, #0x40]
00a008fc	mov x20,x1
00a00900	orr w1,wzr,#0xf
00a00904	mov x21,x0
00a00908	bl 0x00c32190
00a0090c	cbz w19,0x00a009d0
00a00910	cbz x20,0x00a009e8
00a00914	ldr x8,[x22, #0x8]
00a00918	ldr w9,[x21, #0x28]
00a0091c	ldr x23,[x8]
00a00920	cbz w9,0x00a0095c
00a00924	ldr x21,[x21, #0x40]
00a00928	cbz x21,0x00a0095c
00a0092c	ldp x9,x8,[x21]
00a00930	ldr x1,[x8, #0x8]
00a00934	ldr x0,[x9, #0x8]
00a00938	cmp x1,x0
00a0093c	b.eq 0x00a0095c
00a00940	ldr x2,[x8]
00a00944	bl 0x00c2ff60
00a00948	ldp x9,x8,[x21]
00a0094c	ldr x10,[x8]
00a00950	ldr x11,[x9, #0x8]
00a00954	str x10,[x9]
00a00958	str x11,[x8, #0x8]
00a0095c	ldr x0,[x22]
00a00960	add w8,w23,w19
00a00964	sxtw x1,w8
00a00968	bl 0x00c37010
00a0096c	cbz x0,0x00a009cc
00a00970	ldr x8,[x22]
00a00974	sxtw x2,w19
00a00978	mov x1,x20
00a0097c	ldr x8,[x8, #0x8]
00a00980	add x0,x8,w23, SXTW 
00a00984	bl 0x00c2ffd0
00a00988	ldp x8,x9,[x22]
00a0098c	ldr q0,[x8, #0x10]
00a00990	str q0,[x9, #0x10]
00a00994	ldr q0,[x8]
00a00998	str q0,[x9]
00a0099c	b 0x00a009d0
00a009a0	bl 0x00c342a0
00a009a4	adrp x0,0x29f000
00a009a8	adrp x2,0x29d000
00a009ac	add x0,x0,#0xf2e
00a009b0	add x2,x2,#0xf86
00a009b4	mov w1,#0xdd
00a009b8	bl 0x00c342b0
00a009bc	mov w0,#0x20
00a009c0	orr w1,wzr,#0x7e
00a009c4	mov x2,xzr
00a009c8	bl 0x00c342c0
00a009cc	mov w19,#0xffffffff
00a009d0	mov w0,w19
00a009d4	ldp x29,x30,[sp, #0x30]
00a009d8	ldp x20,x19,[sp, #0x20]
00a009dc	ldp x22,x21,[sp, #0x10]
00a009e0	ldr x23,[sp], #0x40
00a009e4	ret
00a009e8	bl 0x00c342a0
00a009ec	adrp x0,0x29f000
00a009f0	adrp x2,0x29d000
00a009f4	add x0,x0,#0xf2e
00a009f8	add x2,x2,#0xf86
00a009fc	mov w1,#0xe4
00a00a00	bl 0x00c342b0
00a00a04	mov w1,#0x102
00a00a08	mov w0,#0x20
00a00a0c	movk w1,#0xc, LSL #16
00a00a10	b 0x00a009c4
