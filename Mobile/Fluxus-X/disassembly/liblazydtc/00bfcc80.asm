; std::__ndk1::ctype<char>::do_toupper @ 00bfcc80
00bfcc80	paciasp
00bfcc84	stp x29,x30,[sp, #-0x40]!
00bfcc88	str x23,[sp, #0x10]
00bfcc8c	stp x22,x21,[sp, #0x20]
00bfcc90	stp x20,x19,[sp, #0x30]
00bfcc94	mov x29,sp
00bfcc98	mov x19,x1
00bfcc9c	cmp x1,x2
00bfcca0	b.eq 0x00bfcd1c
00bfcca4	mov x20,x2
00bfcca8	adrp x21,0xd27000
00bfccac	add x21,x21,#0xf8
00bfccb0	adrp x22,0xd27000
00bfccb4	b 0x00bfccdc
00bfccb8	sub w8,w23,#0x7b
00bfccbc	ldrb w9,[x19]
00bfccc0	and w8,w8,#0xff
00bfccc4	sub w10,w9,#0x20
00bfccc8	cmp w8,#0xe6
00bfcccc	csel w23,w9,w10,cc
00bfccd0	strb w23,[x19], #0x1
00bfccd4	cmp x19,x20
00bfccd8	b.eq 0x00bfcd1c
00bfccdc	ldrsb w23,[x19]
00bfcce0	tbnz w23,#0x1f,0x00bfccd0
00bfcce4	ldarb w8,[x21]
00bfcce8	tbnz w8,#0x0,0x00bfccb8
00bfccec	mov x0,x21
00bfccf0	bl 0x00c2fe90
00bfccf4	adrp x1,0x2c6000
00bfccf8	add x1,x1,#0xbfc
00bfccfc	cbz w0,0x00bfccb8
00bfcd00	mov w0,#0x1fbf
00bfcd04	mov x2,xzr
00bfcd08	bl 0x00c43890
00bfcd0c	str x0,[x22, #0xf0]
00bfcd10	mov x0,x21
00bfcd14	bl 0x00c2fea0
00bfcd18	b 0x00bfccb8
00bfcd1c	mov x0,x19
00bfcd20	ldp x20,x19,[sp, #0x30]
00bfcd24	ldr x23,[sp, #0x10]
00bfcd28	ldp x22,x21,[sp, #0x20]
00bfcd2c	ldp x29,x30,[sp], #0x40
00bfcd30	autiasp
00bfcd34	ret
