/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c25a0..0x1c2800 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c25a0_6 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[12];
    long long field_20;
} st_1c25a0_6;

typedef struct st_1c25a0_4 {
    unsigned int field_0;
} st_1c25a0_4;

typedef struct st_1c25a0_3 {
    struct st_1c25a0_2 *field_0;
    struct st_1c25a0_4 *field_8;
    unsigned long long field_10;
    struct st_1c25a0_5 *field_18;
    struct st_1c25a0_5 *field_20;
    struct st_1c25a0_5 *field_28;
    struct st_1c25a0_5 *field_30;
    struct st_1c25a0_5 *field_38;
    struct st_1c25a0_5 *field_40;
} st_1c25a0_3;

typedef struct st_1c25a0_5 {
    long long field_0;
} st_1c25a0_5;

typedef struct st_1c25a0_1 {
    struct st_1c25a0_2 *field_0;
} st_1c25a0_1;

typedef struct st_1c25a0_2 {
    struct st_1c25a0_1 *field_0;
} st_1c25a0_2;

typedef struct st_1c25a0_0 {
    char field_0;
} st_1c25a0_0;

extern unsigned long long g_e71dc0;
extern unsigned long long g_e71df8;

unsigned long long sub_1c25a0(st_1c25a0_3 *a0, long long a1, st_1c25a0_6 *a2, unsigned long long *a3)
{
    unsigned long long v9;  // w0
    unsigned long v0;  // [bp-0x90], Other Possible Types: unsigned long long
    st_1c25a0_0 **v1;  // [bp-0x88], Other Possible Types: char
    st_1c25a0_0 *v2;  // [bp-0x80]
    st_1c25a0_2 **v3;  // [bp-0x78], Other Possible Types: unsigned long
    unsigned int v4;  // [bp-0x70]
    st_1c25a0_2 **v5;  // [bp-0x60]
    st_1c25a0_2 **v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v2 = &v1;
    v1 = &v2;
    v3 = &v6;
    v6 = &v3;
    if (sub_6b08(a0->field_0))
    {
        sub_1b2214(*(int *)a0->field_8, a0->field_0);
        v5 = &v6;
        v6 = &v5;
        if (!sub_6b08(&v3))
            v3 = a0->field_0;
        if (sub_1a26b0(a1, &v3) & 1)
        {
            goto *((void *)(g_e71dc0));
        }
        else
        {
            *(unsigned int *)a0->field_10 = 3;
            goto *((void *)(g_e71df8));
        }
    }
    else
    {
        v3 = &v6;
        v6 = &v3;
        v0 = 0;
        v0 = _fcntl(a1, 3) | 4;
        _fcntl(a1, 4);
        if (!(_connect(a1, a2->field_20, a2->field_10) >> 31 & 1))
            goto LABEL_1c26b4;
        v3 = &v6;
        v6 = &v3;
        if (*(int *)___error() != 36)
        {
            *(unsigned int *)a0->field_10 = 2;
            return 0;
        }
        v9 = (unsigned int)sub_1bd340(a1, *(long long *)a0->field_18, *(long long *)a0->field_20);
        *(unsigned int *)a0->field_10 = v9;
        switch (v9)
        {
        case 0:
LABEL_1c26b4:
            v3 = &v6;
            v6 = &v3;
            v0 = 0;
            v0 = _fcntl(a1, 3) & 0xfffffffb;
            _fcntl(a1, 4);
            v3 = *(long long *)a0->field_28;
            v4 = *(long long *)a0->field_30;
            v5 = &v6;
            v6 = &v5;
            _setsockopt(a1, 0xffff, 0x1006, &v3, 16);
            v3 = *(long long *)a0->field_38;
            v4 = *(long long *)a0->field_40;
            v5 = &v6;
            v6 = &v5;
            _setsockopt(a1, 0xffff, 0x1005, &v3, 16);
            *(unsigned int *)a0->field_10 = 0;
            return 1;
        case 14:
            *(char *)a3 = 1;
            return 0;
        default:
            return 0;
        }
    }
}
