; std::__ndk1::ios_base::pword @ 00bcdd20
00bcdd20	paciasp
00bcdd24	stp x29,x30,[sp, #-0x40]!
00bcdd28	stp x24,x23,[sp, #0x10]
00bcdd2c	stp x22,x21,[sp, #0x20]
00bcdd30	stp x20,x19,[sp, #0x30]
00bcdd34	mov x29,sp
00bcdd38	sxtw x21,w1
00bcdd3c	ldr x8,[x0, #0x80]
00bcdd40	mov x19,x0
00bcdd44	add x22,x21,#0x1
00bcdd48	cmp x22,x8
00bcdd4c	b.ls 0x00bcddd8
00bcdd50	ldp x8,x0,[x19, #0x68]
00bcdd54	mov x9,#0xfffffffffffffff
00bcdd58	lsl x8,x8,#0x1
00bcdd5c	cmp x8,x22
00bcdd60	csel x8,x8,x22,hi
00bcdd64	cmp x22,x9
00bcdd68	mov x9,#0x1fffffffffffffff
00bcdd6c	csel x23,x8,x9,cc
00bcdd70	lsl x20,x23,#0x3
00bcdd74	mov x1,x20
00bcdd78	bl 0x00c30950
00bcdd7c	cbz x0,0x00bcde04
00bcdd80	ldr x24,[x19, #0x78]
00bcdd84	str x0,[x19, #0x70]
00bcdd88	cmp x24,x23
00bcdd8c	b.cs 0x00bcddd0
00bcdd90	lsl x9,x24,#0x3
00bcdd94	add x11,x20,x0
00bcdd98	mov x20,x0
00bcdd9c	mov w1,wzr
00bcdda0	add x8,x0,x9
00bcdda4	add x10,x8,#0x8
00bcdda8	cmp x10,x11
00bcddac	csel x10,x10,x11,hi
00bcddb0	mvn x11,x0
00bcddb4	mov x0,x8
00bcddb8	add x10,x10,x11
00bcddbc	sub x9,x10,x9
00bcddc0	and x9,x9,#-0x8
00bcddc4	add x2,x9,#0x8
00bcddc8	bl 0x00c301c0
00bcddcc	mov x0,x20
00bcddd0	str x23,[x19, #0x80]
00bcddd4	b 0x00bcdddc
00bcddd8	ldp x0,x24,[x19, #0x70]
00bcdddc	cmp x24,x22
00bcdde0	add x0,x0,x21, LSL #0x3
00bcdde4	csel x8,x24,x22,hi
00bcdde8	str x8,[x19, #0x78]
00bcddec	ldp x20,x19,[sp, #0x30]
00bcddf0	ldp x22,x21,[sp, #0x20]
00bcddf4	ldp x24,x23,[sp, #0x10]
00bcddf8	ldp x29,x30,[sp], #0x40
00bcddfc	autiasp
00bcde00	ret
00bcde04	ldp w8,w9,[x19, #0x20]
00bcde08	orr w8,w8,#0x1
00bcde0c	tst w9,w8
00bcde10	str w8,[x19, #0x20]
00bcde14	b.ne 0x00bcde28
00bcde18	adrp x0,0xd26000
00bcde1c	add x0,x0,#0x738
00bcde20	str xzr,[x0]
00bcde24	b 0x00bcddec
00bcde28	adrp x0,0x2ac000
00bcde2c	add x0,x0,#0xd42
00bcde30	bl 0x00bce038
