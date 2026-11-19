; FUN_008b7000 @ 008b7000
008b7000	stp x29,x30,[sp, #-0x30]!
008b7004	str x21,[sp, #0x10]
008b7008	stp x20,x19,[sp, #0x20]
008b700c	mov x29,sp
008b7010	ldr x8,[x0, #0x20]
008b7014	ldr x9,[x0, #0x50]
008b7018	ldr x20,[x0, #0x68]
008b701c	cmp x8,x9
008b7020	b.hi 0x008b7040
008b7024	mov x10,x8
008b7028	ldr x11,[x10, #0x18]
008b702c	add x10,x10,#0x30
008b7030	cmp x20,x11
008b7034	csel x20,x11,x20,cc
008b7038	cmp x10,x9
008b703c	b.ls 0x008b7028
008b7040	ldrsw x10,[x0, #0x44]
008b7044	mov w11,#0x4e20
008b7048	cmp w10,w11
008b704c	b.le 0x008b7060
008b7050	ldp x20,x19,[sp, #0x20]
008b7054	ldr x21,[sp, #0x10]
008b7058	ldp x29,x30,[sp], #0x30
008b705c	ret
008b7060	ldr x21,[x0, #0x58]
008b7064	cmp w10,#0x11
008b7068	b.lt 0x008b70a0
008b706c	sub x8,x9,x8
008b7070	mov w9,#0xaaab
008b7074	lsr x8,x8,#0x4
008b7078	movk w9,#0xaaaa, LSL #16
008b707c	mul w8,w8,w9
008b7080	sxtw x9,w8
008b7084	add x8,x9,w8, SXTW  #0x1
008b7088	cmp x8,x10
008b708c	b.cs 0x008b70a0
008b7090	lsr w1,w10,#0x1
008b7094	mov x19,x0
008b7098	bl 0x008b4164
008b709c	mov x0,x19
008b70a0	ldr w8,[x0, #0x40]
008b70a4	cmp w8,#0x5b
008b70a8	b.lt 0x008b7050
008b70ac	sub x9,x20,x21
008b70b0	sbfx x10,x9,#0x4,#0x20
008b70b4	lsr x9,x9,#0x4
008b70b8	add x9,x10,w9, SXTW  #0x1
008b70bc	sxtw x10,w8
008b70c0	cmp x9,x10
008b70c4	b.cs 0x008b7050
008b70c8	lsr w1,w8,#0x1
008b70cc	mov w2,wzr
008b70d0	ldp x20,x19,[sp, #0x20]
008b70d4	ldr x21,[sp, #0x10]
008b70d8	ldp x29,x30,[sp], #0x30
008b70dc	b 0x008b3fdc
