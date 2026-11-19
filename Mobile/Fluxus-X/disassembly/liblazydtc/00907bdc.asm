; FUN_00907bdc @ 00907bdc
00907bdc	str x25,[sp, #-0x50]!
00907be0	stp x24,x23,[sp, #0x10]
00907be4	stp x22,x21,[sp, #0x20]
00907be8	stp x20,x19,[sp, #0x30]
00907bec	stp x29,x30,[sp, #0x40]
00907bf0	add x29,sp,#0x40
00907bf4	mov x19,x5
00907bf8	mov w20,w4
00907bfc	mov w21,w3
00907c00	mov x22,x1
00907c04	mov x23,x0
00907c08	cbz x0,0x00907c5c
00907c0c	adrp x25,0x907000
00907c10	mov w0,wzr
00907c14	eor w24,w2,#0x1
00907c18	add x25,x25,#0xbd4
00907c1c	ldr x8,[x23]
00907c20	ldr x8,[x8, #0x58]
00907c24	cmp x8,x25
00907c28	b.eq 0x00907c54
00907c2c	mov x0,x23
00907c30	mov x1,x22
00907c34	mov w2,w21
00907c38	mov w3,w20
00907c3c	mov x4,x19
00907c40	blr x8
00907c44	cmp w0,#0x0
00907c48	cset w8,ne
00907c4c	and w8,w8,w24
00907c50	tbnz w8,#0x0,0x00907c5c
00907c54	ldr x23,[x23, #0x8]
00907c58	cbnz x23,0x00907c1c
00907c5c	ldp x29,x30,[sp, #0x40]
00907c60	ldp x20,x19,[sp, #0x30]
00907c64	ldp x22,x21,[sp, #0x20]
00907c68	ldp x24,x23,[sp, #0x10]
00907c6c	ldr x25,[sp], #0x50
00907c70	ret
