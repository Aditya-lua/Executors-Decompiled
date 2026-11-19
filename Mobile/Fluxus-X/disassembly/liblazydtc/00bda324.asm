; std::__ndk1::collate<wchar_t>::do_hash @ 00bda324
00bda324	bti c
00bda328	cmp x1,x2
00bda32c	b.eq 0x00bda354
00bda330	mov x0,xzr
00bda334	ldr w8,[x1], #0x4
00bda338	cmp x1,x2
00bda33c	add x8,x8,x0, LSL #0x4
00bda340	and x9,x8,#-0x1000000000000000
00bda344	bfxil x9,x9,#0x38,#0x8
00bda348	eor x0,x9,x8
00bda34c	b.ne 0x00bda334
00bda350	ret
00bda354	mov x0,xzr
00bda358	ret
