/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d04d8..0x3d10fc (3108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d04d8_1 {
    struct st_3d04d8_0 *field_0;
} st_3d04d8_1;

typedef struct st_3d04d8_0 {
    char field_0;
} st_3d04d8_0;

typedef struct st_3d04d8_2 {
    unsigned long long field_0;
} st_3d04d8_2;

extern unsigned long long g_e7ddf8;
extern st_3d04d8_2 *g_f0b120;
extern char _NSHomeDirectory;
extern char g_10002b0;

unsigned long long sub_3d04d8(long long *a0, unsigned long long a1, unsigned int a2)
{
    unsigned long v24;  // x20
    unsigned long long v25;  // x0
    unsigned long long v26;  // x0
    unsigned int v27;  // w0
    unsigned int v28;  // w0
    unsigned long long v29;  // x8
    unsigned long long v30;  // x9
    unsigned long long v31;  // x8
    unsigned int v0;  // [bp-0x508]
    unsigned long long v1;  // [bp-0x504]
    char *v2;  // [bp-0x500]
    unsigned long long v3;  // [bp-0x4f4]
    unsigned long long v4;  // [bp-0x4f0]
    long long *v5;  // [bp-0x4e8]
    unsigned long long v6;  // [bp-0x4dc]
    unsigned long long *v7;  // [bp-0x4d8]
    unsigned long long v8;  // [bp-0x4cc]
    unsigned long long v9;  // [bp-0x4c8]
    st_3d04d8_0 **v10;  // [bp-0x4c0], Other Possible Types: char
    st_3d04d8_0 *v11;  // [bp-0x4b8]
    unsigned long long v12;  // [bp-0x4a4]
    unsigned long long v13;  // [bp-0x4a2]
    st_3d04d8_0 **v14;  // [bp-0x4a0], Other Possible Types: char
    st_3d04d8_0 *v15;  // [bp-0x498]
    st_3d04d8_0 *v16;  // [bp-0x490], Other Possible Types: st_3d04d8_1 **
    st_3d04d8_0 **v17;  // [bp-0x488], Other Possible Types: st_3d04d8_1 **, char
    st_3d04d8_0 *v18;  // [bp-0x480], Other Possible Types: st_3d04d8_1 **
    st_3d04d8_0 **v19;  // [bp-0x478], Other Possible Types: st_3d04d8_1 **, char
    char v20;  // [bp-0x46d]
    unsigned long v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v21 = *(long long *)&g_10002b0;
    v11 = &v10;
    v10 = &v11;
    v13 = 0;
    v12 = 0;
    v24 = *a0;
    a0[1] = 0;
    a0[2] = 0;
    a0[3] = 0;
    v25 = sub_3ca60c(v24);
    if ((unsigned int)v25)
    {
        v25 = 1;
        if (a1 != 1)
        {
            v8 = a1;
            v7 = a0 + 1;
            v0 = a2;
            v1 = 0;
            v4 = 0;
            v5 = a0;
            v9 = 0;
            v6 = 0;
            v3 = 0;
            v2 = &v20;
            v15 = &v14;
            v16 = &v17;
            v14 = &v15;
            v17 = &v16;
            v18 = &v19;
            v19 = &v18;
            sub_3d706c(v24);
            sub_3d706c(v24);
            v18 = &v19;
            v19 = &v18;
            sub_3d706c(v24);
            sub_3d706c(v24);
            v16 = &v17;
            v17 = &v16;
            v18 = &v19;
            v19 = &v18;
            v26 = sub_3d706c(v24);
            v27 = sub_3d706c(v24);
            v18 = &v19;
            v19 = &v18;
            v28 = sub_3d706c(v24);
            v29 = (v26 * &_NSHomeDirectory | v26 >> 40) & 0xffffffff000000 & 0xffffffffffffff | v27 * 0x10000 | v28 * 0x100 | sub_3d706c(v24) & 0xffffffff;
            v30 = 720;
            if (v29 == 1130840649)
                v30 = 168;
            if (v29 == 1229472850)
                v30 = 224;
            if (v29 == 1347179589)
                v30 = 424;
            if (v29 == 1951551059)
                v30 = 48;
            if (v29 == 1229209940)
                v30 = 192;
            v31 = 504;
            if (v29 != 1229278788)
                v31 = v30;
            goto *((void *)(*(long long *)((char *)&g_e7ddf8 + v31)));
        }
    }
    if (*(long long *)&g_10002b0 == v21)
        return v25;
    ___stack_chk_fail();
    g_f0b120();
}
