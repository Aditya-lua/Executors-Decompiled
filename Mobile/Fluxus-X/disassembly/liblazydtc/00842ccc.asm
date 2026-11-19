; FUN_00842ccc @ 00842ccc
00842ccc	stp x29,x30,[sp, #-0x40]!
00842cd0	str x23,[sp, #0x10]
00842cd4	stp x22,x21,[sp, #0x20]
00842cd8	stp x20,x19,[sp, #0x30]
00842cdc	mov x29,sp
00842ce0	mov x19,x2
00842ce4	mov x22,x1
00842ce8	mov x20,x0
00842cec	bl 0x00842d60
00842cf0	cmp x0,x22
00842cf4	b.eq 0x00842d0c
00842cf8	ldp x20,x19,[sp, #0x30]
00842cfc	ldr x23,[sp, #0x10]
00842d00	ldp x22,x21,[sp, #0x20]
00842d04	ldp x29,x30,[sp], #0x40
00842d08	ret
00842d0c	ldr x21,[x20, #0x38]
00842d10	ldr w23,[x20, #0x1c]
00842d14	mov x0,x20
00842d18	mov x1,x22
00842d1c	mov x2,x19
00842d20	bl 0x008430a0
00842d24	mov x1,x0
00842d28	cmp x0,x22
00842d2c	mov x0,x22
00842d30	b.eq 0x00842cf8
00842d34	ldr w8,[x20, #0x1c]
00842d38	add w4,w23,#0x1
00842d3c	mov x0,x20
00842d40	mov x2,x19
00842d44	add w5,w8,#0x1
00842d48	mov x3,x21
00842d4c	ldp x20,x19,[sp, #0x30]
00842d50	ldr x23,[sp, #0x10]
00842d54	ldp x22,x21,[sp, #0x20]
00842d58	ldp x29,x30,[sp], #0x40
00842d5c	b 0x00843334
