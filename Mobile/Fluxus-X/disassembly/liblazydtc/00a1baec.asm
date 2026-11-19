; BN_mod_exp_mont @ 00a1baec
00a1baec	sub sp,sp,#0x180
00a1baf0	stp x22,x21,[sp, #0x150]
00a1baf4	mov x21,x0
00a1baf8	mov x0,x3
00a1bafc	stp x28,x27,[sp, #0x120]
00a1bb00	stp x26,x25,[sp, #0x130]
00a1bb04	stp x24,x23,[sp, #0x140]
00a1bb08	stp x20,x19,[sp, #0x160]
00a1bb0c	stp x29,x30,[sp, #0x170]
00a1bb10	add x29,sp,#0x170
00a1bb14	mov x20,x5
00a1bb18	mov x19,x4
00a1bb1c	mov x26,x3
00a1bb20	mov x23,x2
00a1bb24	mov x28,x1
00a1bb28	bl 0x00c38d10
00a1bb2c	cbz w0,0x00a1bb90
00a1bb30	ldr w8,[x26, #0x8]
00a1bb34	cmp w8,#0x100, LSL #12
00a1bb38	b.ge 0x00a1bbc4
00a1bb3c	mov w1,#0x4
00a1bb40	mov x0,x23
00a1bb44	bl 0x00c38ce0
00a1bb48	cbnz w0,0x00a1bb6c
00a1bb4c	mov w1,#0x4
00a1bb50	mov x0,x28
00a1bb54	bl 0x00c38ce0
00a1bb58	cbnz w0,0x00a1bb6c
00a1bb5c	mov w1,#0x4
00a1bb60	mov x0,x26
00a1bb64	bl 0x00c38ce0
00a1bb68	cbz w0,0x00a1bbc4
00a1bb6c	mov x0,x21
00a1bb70	mov x1,x28
00a1bb74	mov x2,x23
00a1bb78	mov x3,x26
00a1bb7c	mov x4,x19
00a1bb80	mov x5,x20
00a1bb84	bl 0x00a1c3f8
00a1bb88	mov w21,w0
00a1bb8c	b 0x00a1bfd0
00a1bb90	bl 0x00c342a0
00a1bb94	adrp x0,0x2c9000
00a1bb98	adrp x2,0x2a5000
00a1bb9c	add x0,x0,#0x65b
00a1bba0	add x2,x2,#0xd1a
00a1bba4	mov w1,#0x148
00a1bba8	bl 0x00c342b0
00a1bbac	orr w0,wzr,#0x3
00a1bbb0	mov w1,#0x66
00a1bbb4	mov x2,xzr
00a1bbb8	bl 0x00c342c0
00a1bbbc	mov w21,wzr
00a1bbc0	b 0x00a1bfd0
00a1bbc4	mov x0,x23
00a1bbc8	bl 0x00c322f0
00a1bbcc	cbz w0,0x00a1bc6c
00a1bbd0	mov w25,w0
00a1bbd4	mov x0,x19
00a1bbd8	bl 0x00c38a90
00a1bbdc	mov x0,x19
00a1bbe0	bl 0x00c38a40
00a1bbe4	mov x27,x0
00a1bbe8	mov x0,x19
00a1bbec	bl 0x00c38a40
00a1bbf0	str x0,[sp, #0x8]
00a1bbf4	mov x0,x19
00a1bbf8	bl 0x00c38a40
00a1bbfc	str x0,[sp, #0x18]
00a1bc00	cbz x0,0x00a1bc8c
00a1bc04	mov x22,x0
00a1bc08	mov x24,x20
00a1bc0c	cbz x20,0x00a1bc9c
00a1bc10	ldr w8,[x28, #0x10]
00a1bc14	cbnz w8,0x00a1bc28
00a1bc18	mov x0,x28
00a1bc1c	mov x1,x26
00a1bc20	bl 0x00c369c0
00a1bc24	tbnz w0,#0x1f,0x00a1bc44
00a1bc28	mov x0,x22
00a1bc2c	mov x1,x28
00a1bc30	mov x2,x26
00a1bc34	mov x3,x19
00a1bc38	bl 0x00c38f30
00a1bc3c	mov x28,x22
00a1bc40	cbz w0,0x00a1bfb8
00a1bc44	mov x0,x22
00a1bc48	mov x1,x28
00a1bc4c	mov x2,x24
00a1bc50	mov x3,x19
00a1bc54	bl 0x00c39020
00a1bc58	cbz w0,0x00a1bfb8
00a1bc5c	cmp w25,#0x29f
00a1bc60	b.le 0x00a1bcd8
00a1bc64	orr w8,wzr,#0x6
00a1bc68	b 0x00a1bd04
00a1bc6c	mov w1,#0x1
00a1bc70	mov x0,x26
00a1bc74	bl 0x00c38c60
00a1bc78	cbz w0,0x00a1bcc4
00a1bc7c	mov x0,x21
00a1bc80	bl 0x00c38e00
00a1bc84	mov w21,#0x1
00a1bc88	b 0x00a1bfd0
00a1bc8c	mov w21,wzr
00a1bc90	mov x24,xzr
00a1bc94	cbnz x20,0x00a1bfc8
00a1bc98	b 0x00a1bfc0
00a1bc9c	bl 0x00c38f80
00a1bca0	mov x24,x0
00a1bca4	cbz x0,0x00a1bcbc
00a1bca8	mov x0,x24
00a1bcac	mov x1,x26
00a1bcb0	mov x2,x19
00a1bcb4	bl 0x00c38f90
00a1bcb8	cbnz w0,0x00a1bc10
00a1bcbc	mov w21,wzr
00a1bcc0	b 0x00a1bfc0
00a1bcc4	mov w1,#0x1
00a1bcc8	mov x0,x21
00a1bccc	bl 0x00c37720
00a1bcd0	mov w21,w0
00a1bcd4	b 0x00a1bfd0
00a1bcd8	cmp w25,#0xef
00a1bcdc	b.le 0x00a1bce8
00a1bce0	mov w8,#0x5
00a1bce4	b 0x00a1bd04
00a1bce8	cmp w25,#0x4f
00a1bcec	b.le 0x00a1bcf8
00a1bcf0	mov w8,#0x4
00a1bcf4	b 0x00a1bd04
00a1bcf8	cmp w25,#0x18
00a1bcfc	b.lt 0x00a1bda8
00a1bd00	orr w8,wzr,#0x3
00a1bd04	mov x0,x27
00a1bd08	mov x1,x22
00a1bd0c	mov x2,x22
00a1bd10	mov x3,x24
00a1bd14	mov x4,x19
00a1bd18	str w8,[sp, #0x14]
00a1bd1c	bl 0x00c39000
00a1bd20	cbz w0,0x00a1bfb8
00a1bd24	ldr w8,[sp, #0x14]
00a1bd28	mov w9,#0x1
00a1bd2c	sub w8,w8,#0x1
00a1bd30	lsl w8,w9,w8
00a1bd34	cmp w8,#0x2
00a1bd38	b.lt 0x00a1bdb0
00a1bd3c	str w25,[sp, #0x4]
00a1bd40	mov x25,x24
00a1bd44	mov x22,xzr
00a1bd48	sxtw x28,w8
00a1bd4c	add x24,sp,#0x18
00a1bd50	mov x0,x19
00a1bd54	bl 0x00c38a40
00a1bd58	add x8,x24,x22, LSL #0x3
00a1bd5c	str x0,[x8, #0x8]
00a1bd60	cbz x0,0x00a1bd98
00a1bd64	ldr x1,[x24, x22, LSL #0x3]
00a1bd68	mov x2,x27
00a1bd6c	mov x3,x25
00a1bd70	mov x4,x19
00a1bd74	bl 0x00c39000
00a1bd78	cbz w0,0x00a1bd98
00a1bd7c	add x8,x22,#0x2
00a1bd80	add x22,x22,#0x1
00a1bd84	cmp x8,x28
00a1bd88	b.lt 0x00a1bd50
00a1bd8c	mov x24,x25
00a1bd90	ldr w25,[sp, #0x4]
00a1bd94	b 0x00a1bdb0
00a1bd98	mov w21,wzr
00a1bd9c	mov x24,x25
00a1bda0	cbnz x20,0x00a1bfc8
00a1bda4	b 0x00a1bfc0
00a1bda8	mov w8,#0x1
00a1bdac	str w8,[sp, #0x14]
00a1bdb0	ldr w27,[x26, #0x8]
00a1bdb4	ldr x8,[x26]
00a1bdb8	sub w22,w27,#0x1
00a1bdbc	ldr x8,[x8, w22, SXTW #0x3]
00a1bdc0	tbnz x8,#0x3f,0x00a1bde8
00a1bdc4	bl 0x00c38de0
00a1bdc8	ldr x26,[sp, #0x8]
00a1bdcc	mov x1,x0
00a1bdd0	mov x2,x24
00a1bdd4	mov x3,x19
00a1bdd8	mov x0,x26
00a1bddc	bl 0x00c39020
00a1bde0	cbnz w0,0x00a1be78
00a1bde4	b 0x00a1bfb8
00a1bde8	ldr x28,[sp, #0x8]
00a1bdec	mov w1,w27
00a1bdf0	mov x0,x28
00a1bdf4	bl 0x00c38e80
00a1bdf8	cbz x0,0x00a1bfb8
00a1bdfc	ldr x8,[x26]
00a1be00	ldr x9,[x28]
00a1be04	cmp w27,#0x2
00a1be08	mov x26,x28
00a1be0c	ldr x10,[x8]
00a1be10	neg x10,x10
00a1be14	str x10,[x9]
00a1be18	b.lt 0x00a1be74
00a1be1c	sub x10,x27,#0x1
00a1be20	cmp x10,#0x4
00a1be24	b.cc 0x00a1be4c
00a1be28	lsl x11,x27,#0x3
00a1be2c	add x12,x9,#0x8
00a1be30	add x13,x8,x11
00a1be34	cmp x12,x13
00a1be38	b.cs 0x00a1bff4
00a1be3c	add x11,x9,x11
00a1be40	add x12,x8,#0x8
00a1be44	cmp x12,x11
00a1be48	b.cs 0x00a1bff4
00a1be4c	mov w10,#0x1
00a1be50	lsl x11,x10,#0x3
00a1be54	add x9,x9,x11
00a1be58	add x8,x8,x11
00a1be5c	sub x10,x27,x10
00a1be60	ldr x11,[x8], #0x8
00a1be64	subs x10,x10,#0x1
00a1be68	mvn x11,x11
00a1be6c	str x11,[x9], #0x8
00a1be70	b.ne 0x00a1be60
00a1be74	str w27,[x26, #0x8]
00a1be78	sub w25,w25,#0x1
00a1be7c	mov w22,#0x1
00a1be80	b 0x00a1be88
00a1be84	sub w25,w25,#0x1
00a1be88	mov x0,x23
00a1be8c	mov w1,w25
00a1be90	bl 0x00c38d00
00a1be94	cbnz w0,0x00a1bec0
00a1be98	cbnz w22,0x00a1beb8
00a1be9c	mov x0,x26
00a1bea0	mov x1,x26
00a1bea4	mov x2,x26
00a1bea8	mov x3,x24
00a1beac	mov x4,x19
00a1beb0	bl 0x00c39000
00a1beb4	cbz w0,0x00a1bfb8
00a1beb8	cbnz w25,0x00a1be84
00a1bebc	b 0x00a1bf94
00a1bec0	ldr w8,[sp, #0x14]
00a1bec4	str w22,[sp, #0x4]
00a1bec8	cmp w8,#0x2
00a1becc	b.cc 0x00a1bf1c
00a1bed0	mov w27,wzr
00a1bed4	sub w22,w25,#0x1
00a1bed8	mov w26,#0x1
00a1bedc	mov w28,#0x1
00a1bee0	tbnz w22,#0x1f,0x00a1bf24
00a1bee4	mov x0,x23
00a1bee8	mov w1,w22
00a1beec	bl 0x00c38d00
00a1bef0	cbz w0,0x00a1bf04
00a1bef4	sub w8,w26,w27
00a1bef8	lsl w8,w28,w8
00a1befc	orr w28,w8,#0x1
00a1bf00	mov w27,w26
00a1bf04	ldr w8,[sp, #0x14]
00a1bf08	add w26,w26,#0x1
00a1bf0c	sub w22,w22,#0x1
00a1bf10	cmp w26,w8
00a1bf14	b.cc 0x00a1bee0
00a1bf18	b 0x00a1bf24
00a1bf1c	mov w27,wzr
00a1bf20	mov w28,#0x1
00a1bf24	ldr x26,[sp, #0x8]
00a1bf28	ldr w8,[sp, #0x4]
00a1bf2c	cbnz w8,0x00a1bf60
00a1bf30	tbnz w27,#0x1f,0x00a1bf60
00a1bf34	mov w22,#0xffffffff
00a1bf38	mov x0,x26
00a1bf3c	mov x1,x26
00a1bf40	mov x2,x26
00a1bf44	mov x3,x24
00a1bf48	mov x4,x19
00a1bf4c	bl 0x00c39000
00a1bf50	cbz w0,0x00a1bfb8
00a1bf54	add w22,w22,#0x1
00a1bf58	cmp w22,w27
00a1bf5c	b.lt 0x00a1bf38
00a1bf60	asr w8,w28,#0x1
00a1bf64	add x9,sp,#0x18
00a1bf68	ldr x2,[x9, w8, SXTW #0x3]
00a1bf6c	mov x0,x26
00a1bf70	mov x1,x26
00a1bf74	mov x3,x24
00a1bf78	mov x4,x19
00a1bf7c	bl 0x00c39000
00a1bf80	cbz w0,0x00a1bfb8
00a1bf84	sub w8,w25,#0x1
00a1bf88	subs w25,w8,w27
00a1bf8c	mov w22,wzr
00a1bf90	b.pl 0x00a1be88
00a1bf94	mov x0,x21
00a1bf98	mov x1,x26
00a1bf9c	mov x2,x24
00a1bfa0	mov x3,x19
00a1bfa4	bl 0x00c38fb0
00a1bfa8	cmp w0,#0x0
00a1bfac	cset w21,ne
00a1bfb0	cbnz x20,0x00a1bfc8
00a1bfb4	b 0x00a1bfc0
00a1bfb8	mov w21,wzr
00a1bfbc	cbnz x20,0x00a1bfc8
00a1bfc0	mov x0,x24
00a1bfc4	bl 0x00c38f70
00a1bfc8	mov x0,x19
00a1bfcc	bl 0x00c38a20
00a1bfd0	mov w0,w21
00a1bfd4	ldp x29,x30,[sp, #0x170]
00a1bfd8	ldp x20,x19,[sp, #0x160]
00a1bfdc	ldp x22,x21,[sp, #0x150]
00a1bfe0	ldp x24,x23,[sp, #0x140]
00a1bfe4	ldp x26,x25,[sp, #0x130]
00a1bfe8	ldp x28,x27,[sp, #0x120]
00a1bfec	add sp,sp,#0x180
00a1bff0	ret
00a1bff4	and w11,w22,#0x3
00a1bff8	sub x13,x10,x11
00a1bffc	add x12,x8,#0x18
00a1c000	add x10,x13,#0x1
00a1c004	add x14,x9,#0x18
00a1c008	ldp q0,q1,[x12, #-0x10]
00a1c00c	add x12,x12,#0x20
00a1c010	subs x13,x13,#0x4
00a1c014	mvn v0.16B,v0.16B
00a1c018	mvn v1.16B,v1.16B
00a1c01c	stp q0,q1,[x14, #-0x10]
00a1c020	add x14,x14,#0x20
00a1c024	b.ne 0x00a1c008
00a1c028	cbnz w11,0x00a1be50
00a1c02c	b 0x00a1be74
