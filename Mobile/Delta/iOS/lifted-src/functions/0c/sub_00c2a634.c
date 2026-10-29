/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2a634..0xc2a744 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c2a634_0 {
    unsigned long long field_0;
    struct st_c2a634_0 *field_8;
    struct st_c2a634_0 *field_10;
} st_c2a634_0;


long long sub_c2a634(st_c2a634_0 **a0, st_c2a634_0 *a1)
{
    st_c2a634_0 *v2;  // x9
    unsigned long long v3;  // 4159
    st_c2a634_0 *v4;  // x21
    st_c2a634_0 *ptr;  // x0
    st_c2a634_0 *v6;  // x8
    st_c2a634_0 *v7;  // x8
    long long v8;  // x0
    long long v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_0 ^ 0x8000000000000000;
    v3 = arm64g_calculate_condition(0x44, a1->field_0, 0, 0);
    if (!(v3 & 1))
        v2 = 1;
    if (!v2)
    {
LABEL_c2a680:
        v7 = a1->field_8;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if ((long long)/* unsupported instruction */ < 0)
        {
            sub_c769bc();
LABEL_c2a720:
            v8 = sub_c6b970(1, v4);
            sub_c26704(a0);
            v9 = __Unwind_Resume(v8);
            sub_c73e0c(v9);
        }
        *a0 = 0x8000000000000000;
        a0[1] = v7;
    }
    else if (v2 == 1)
    {
        v4 = a1->field_10;
        if (v4 < 0)
        {
            sub_c6b970(0, v4);
            goto LABEL_c2a680;
        }
        else
        {
            if (v4)
            {
                ptr = _malloc(v4);
                if (!ptr)
                    goto LABEL_c2a720;
                _memcpy();
                v6 = v4;
            }
            else
            {
                v6 = 0;
                ptr = 1;
            }
            *a0 = v6;
            a0[1] = ptr;
            a0[2] = v4;
        }
    }
    else
    {
        a0[1] = sub_c28cc4(&a1->field_8);
        a0[2] = a1;
        *a0 = 0x8000000000000002;
    }
    return sub_c28e58(a0 + 3, a1 + 1);
}
