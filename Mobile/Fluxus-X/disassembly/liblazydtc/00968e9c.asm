; FUN_00968e9c @ 00968e9c
00968e9c	str x21,[sp, #-0x30]!
00968ea0	stp x20,x19,[sp, #0x10]
00968ea4	stp x29,x30,[sp, #0x20]
00968ea8	add x29,sp,#0x20
00968eac	ldr w8,[x0, #0x13f8]
00968eb0	mov x19,x0
00968eb4	cbz w8,0x00968f08
00968eb8	cmp w8,#0x1
00968ebc	b.lt 0x00968eec
00968ec0	mov x20,xzr
00968ec4	ldr x8,[x19, #0x1400]
00968ec8	lsl x21,x20,#0x3
00968ecc	ldr x0,[x8, x21#0x0]
00968ed0	bl 0x00c31040
00968ed4	ldr x8,[x19, #0x1400]
00968ed8	add x20,x20,#0x1
00968edc	str xzr,[x8, x21#0x0]
00968ee0	ldrsw x8,[x19, #0x13f8]
00968ee4	cmp x20,x8
00968ee8	b.lt 0x00968ec4
00968eec	adrp x8,0xcc4000
00968ef0	add x8,x8,#0x678
00968ef4	ldr x0,[x19, #0x1400]
00968ef8	ldr x8,[x8]
00968efc	blr x8
00968f00	str xzr,[x19, #0x1400]
00968f04	str wzr,[x19, #0x13f8]
00968f08	ldp x29,x30,[sp, #0x20]
00968f0c	ldp x20,x19,[sp, #0x10]
00968f10	ldr x21,[sp], #0x30
00968f14	ret
