/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c3924..0x1c3b30 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c3924_1 {
    char padding_0[24];
    unsigned int field_18;
} st_1c3924_1;

typedef struct st_1c3924_0 {
    char field_0;
} st_1c3924_0;

extern char g_10002b0;

unsigned long long sub_1c3924(long long a0, long long a1, st_1c3924_1 *a2, unsigned long a3, long long a4, long long a5)
{
    unsigned long long v31;  // x0
    long long v32;  // x0
    long long v33;  // x0
    st_1c3924_0 **v0;  // [bp-0x418], Other Possible Types: char
    st_1c3924_0 *v1;  // [bp-0x410]
    st_1c3924_0 **v2;  // [bp-0x408], Other Possible Types: char
    st_1c3924_0 *v3;  // [bp-0x400]
    unsigned long long v4;  // [bp-0x3f8]
    unsigned long long v5;  // [bp-0x3f0]
    unsigned long long v6;  // [bp-0x3e8]
    unsigned int v7;  // [bp-0x3e0]
    unsigned long long v8;  // [bp-0x3d8]
    unsigned long long v9;  // [bp-0x3c8]
    unsigned long long v10;  // [bp-0x3b8]
    unsigned long long v11;  // [bp-0x3a8]
    unsigned int v12;  // [bp-0x3a0]
    unsigned long long v13;  // [bp-0x398]
    unsigned long long v14;  // [bp-0x388]
    unsigned long long v15;  // [bp-0x378]
    unsigned long long v16;  // [bp-0x368]
    unsigned long long v17;  // [bp-0x348]
    unsigned long long v18;  // [bp-0x328]
    unsigned long long v19;  // [bp-0x320]
    unsigned long long v20;  // [bp-0x318]
    unsigned long long v21;  // [bp-0x308]
    unsigned long long v22;  // [bp-0x2f8]
    char v23;  // [bp-0x2e8]
    char v24;  // [bp-0x2d0]
    char v25;  // [bp-0x2a0]
    char v26;  // [bp-0x278]
    unsigned long v27;  // [bp-0xa0]
    unsigned long v28;  // [bp-0x58]
    char *v29;  // [bp-0x10]
    char v30;  // [bp+0x0]

    v29 = &v30;
    v28 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_1b0464(&v23);
    v24 = a3;
    v27 -= 1;
    if (a2->field_18 == 303 && !(sub_9fd8(a1, "GET") & 1) && !(sub_9fd8(a1, "HEAD") & 1))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&v23, "GET");
        sub_30d84(&v26);
        sub_1bea80(&v25);
    }
    v4 = 0;
    v5 = 0;
    v6 = 0;
    v7 = 0xffffffff;
    v8 = 0;
    v9 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0x3f800000;
    v18 = 0;
    v19 = 0;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    v17 = 0;
    v16 = 0;
    v20 = 0;
    v21 = 0;
    v22 = 0;
    v31 = sub_1bcd6c(a0, &v23, &v4, a5);
    if ((unsigned int)v31)
    {
        sub_1b2b74(a1, &v23);
        sub_1a922c(a2, &v4);
        v3 = &v2;
        v2 = &v3;
        if (!sub_6b08(&a2[4].padding_0[8]))
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a2[4].padding_0[8], a4);
    }
    sub_1b8250(&v4);
    sub_1adb9c(&v23);
    if (*(long long *)&g_10002b0 == v28)
        return v31;
    v32 = __Unwind_Resume(___stack_chk_fail());
    sub_1adb9c(&v23);
    v33 = __Unwind_Resume(v32);
    sub_1b8250(&v4);
    sub_1adb9c(&v23);
    __Unwind_Resume(v33);
}
