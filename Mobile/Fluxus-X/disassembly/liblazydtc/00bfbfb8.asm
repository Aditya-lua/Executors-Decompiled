; std::__ndk1::collate_byname<wchar_t>::collate_byname @ 00bfbfb8
00bfbfb8	paciasp
00bfbfbc	sub sp,sp,#0x40
00bfbfc0	stp x29,x30,[sp, #0x20]
00bfbfc4	stp x20,x19,[sp, #0x30]
00bfbfc8	add x29,sp,#0x20
00bfbfcc	adrp x8,0xcb5000
00bfbfd0	sub x9,x2,#0x1
00bfbfd4	mov x20,x1
00bfbfd8	ldr x8,[x8, #0xe10]
00bfbfdc	mov x19,x0
00bfbfe0	add x8,x8,#0x10
00bfbfe4	stp x8,x9,[x0]
00bfbfe8	ldrb w8,[x1]
00bfbfec	ldr x9,[x1, #0x10]
00bfbff0	tst w8,#0x1
00bfbff4	csinc x1,x9,x1,ne
00bfbff8	mov w0,#0x1fbf
00bfbffc	mov x2,xzr
00bfc000	bl 0x00c43890
00bfc004	str x0,[x19, #0x10]
00bfc008	cbz x0,0x00bfc020
00bfc00c	ldp x20,x19,[sp, #0x30]
00bfc010	ldp x29,x30,[sp, #0x20]
00bfc014	add sp,sp,#0x40
00bfc018	autiasp
00bfc01c	ret
00bfc020	adrp x0,0x29f000
00bfc024	add x0,x0,#0xbb
00bfc028	add x8,sp,#0x8
00bfc02c	mov x1,x20
00bfc030	add x20,sp,#0x8
00bfc034	bl 0x00c304a0
00bfc038	ldrb w8,[sp, #0x8]
00bfc03c	ldr x9,[sp, #0x18]
00bfc040	tst w8,#0x1
00bfc044	csinc x0,x9,x20,ne
00bfc048	bl 0x00c43d00
00bfc04c	ldrb w8,[sp, #0x8]
00bfc050	mov x20,x0
00bfc054	tbz w8,#0x0,0x00bfc074
00bfc058	ldr x8,[sp, #0x8]
00bfc05c	ldr x0,[sp, #0x18]
00bfc060	and x1,x8,#-0x2
00bfc064	bl 0x00c2fe80
00bfc068	b 0x00bfc074
00bfc074	mov x0,x19
00bfc078	bl 0x00c31530
00bfc07c	mov x0,x20
00bfc080	bl 0x00c2c090
