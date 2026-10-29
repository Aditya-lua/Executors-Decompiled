/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b628..0x97b768 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b628_0 {
    struct st_97b628_0 *field_0;
    struct st_97b628_0 *field_8;
    unsigned long long field_10;
    char padding_18[257];
    struct st_97b628_0 *field_119;
} st_97b628_0;

typedef struct st_97b628_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[32];
    struct st_97b628_0 *field_30;
    char padding_38[8];
    struct st_97b628_0 *field_40;
    struct st_97b628_0 *field_48;
    unsigned long long field_50;
    struct st_97b628_0 *field_58;
    struct st_97b628_0 *field_60;
    unsigned long long field_68;
} st_97b628_1;

extern char g_10002b0;

int sub_97b628(st_97b628_1 *a0)
{
    st_97b628_0 *v4;  // x20
    st_97b628_0 *v5;  // w0
    st_97b628_0 *v6;  // x8
    st_97b628_0 *v7;  // x9
    st_97b628_0 *v8;  // x8
    st_97b628_0 *v9;  // x8
    char v0;  // [bp-0x4d]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = a0->field_58;
    if (v4)
    {
        do
        {
            v5 = (st_97b628_0 *)(unsigned int)sub_991384(&v4->field_119, v4->field_10, a0->field_8, &v0);
            if (a0->field_58 == v4)
                a0->field_58 = v4->field_0;
            v6 = v4->field_8;
            if (a0->field_60 != v4)
            {
                v7 = v4->field_0;
                if (!v6)
                    continue;
            }
            else
            {
                a0->field_60 = v6;
                v7 = v4->field_0;
                if (!v6)
                    continue;
            }
            v6->field_0 = v7;
            if (v7)
                v7->field_8 = v6;
            a0->field_68 = a0->field_68 - 1;
            v4->field_0 = 0;
            v4->field_8 = 0;
            v8 = a0->field_30;
            if (v8)
            {
                (v4->padding_18)[1] = 2;
                v8();
            }
            v9 = a0->field_48;
            if (v9)
                v9->field_0 = v4;
            v4->field_0 = 0;
            v4->field_8 = v9;
            a0->field_48 = v4;
            if (!a0->field_40)
                a0->field_40 = v4;
            a0->field_50 = a0->field_50 + 1;
            (v4->padding_18)[1] = 0;
            v4 = a0->field_58;
        } while (a0->field_58);
    }
    if (*(long long *)&g_10002b0 == v1)
        return 1;
    ___stack_chk_fail();
}
