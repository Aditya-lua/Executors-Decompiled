/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cdd00..0x9cde20 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cdd00_0 {
    struct st_9cdd00_0 *field_0;
    struct st_9cdd00_0 *field_8;
    char padding_10[8];
    struct st_9cdd00_0 *field_18;
    struct st_9cdd00_0 *field_20;
    unsigned int field_28;
} st_9cdd00_0;


st_9cdd00_0 ** sub_9cdd00(st_9cdd00_0 **a0, void* a1, unsigned long long a2)
{
    void* v2;  // x8
    void* v3;  // x3
    st_9cdd00_0 *v4;  // x8
    unsigned int v5;  // w9
    st_9cdd00_0 *v6;  // x0
    unsigned long long v8;  // 4112
    st_9cdd00_0 **v9;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        v6 = *a0;
        v4 = v6->field_8;
        if (!v6->field_8)
            return &v6->field_8;
        v5 = (int)*a0->field_0;
        a0 = &v6->field_8;
        goto LABEL_9cdd94;
    }
    v2 = (long long)a1[32];
    if ((unsigned int)a2)
    {
        if (!v2 || !(v3 = (long long)v2[32], (long long)v2[32]))
            goto LABEL_9cdd58;
LABEL_9cdd4c:
        goto *((void *)(v3));
    }
    if (v2 && (v3 = (long long)v2[24], (long long)v2[24]))
        goto LABEL_9cdd4c;
LABEL_9cdd58:
    if (*(char *)a1 == 5)
    {
        v4 = *a0;
        if (!*a0)
            return a0;
        goto LABEL_9cdd6c;
    }
    else
    {
        v5 = (int)a1[8];
        if ((int)a1[8] == 1)
        {
            *(int *)a0 = (int)a1[40];
            return a0;
        }
        v4 = *a0;
        if (!*a0)
            return a0;
LABEL_9cdd94:
        if (4 >= (int)v5)
        {
            v8 = arm64g_calculate_condition(1, v5, 4, 0);
            if (!(v8 & 1))
            {
                if (v5 == 1)
                {
                    if (a1)
                    {
                        *(int *)a0 = (int)a1[40];
                        return a0;
                    }
                    *(unsigned int *)a0 = (unsigned int)0xffffffff;
                    return a0;
                }
LABEL_9cdd6c:
                sub_9c7a20(v4, a2);
            }
            else
            {
                v9 = a0;
                sub_9cdd00(a0, NULL, 0);
                sub_a6c2e4(*v9, "crypto/asn1/tasn_fre.c", 0xcc);
                a0 = v9;
            }
        }
        else
        {
            if (v5 == 5)
            {
                *a0 = 0;
                return a0;
            }
            if (v5 != 6)
                goto LABEL_9cdd6c;
            sub_9c3580(v4);
        }
        *a0 = 0;
        return a0;
    }
}
