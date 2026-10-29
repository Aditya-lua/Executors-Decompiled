/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa15520..0xa15668 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a15520_0 {
    struct st_a15520_0 *field_0;
    struct st_a15520_0 *field_8;
} st_a15520_0;

extern long long g_e8e828;
extern long long g_e8e950;

st_a15520_0 * sub_a15520(long long a0, st_a15520_0 *a1)
{
    st_a15520_0 *v2;  // x19
    st_a15520_0 *v3;  // x20
    st_a15520_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = a1;
        if ((int)a1->field_0 != 1)
        {
            if (!(int)a1->field_0)
                sub_9c3580(v2->field_8);
        }
        else
        {
            if (v2->field_8)
                sub_9cd960(v2->field_8, &g_e8e828);
        }
    }
    else
    {
        v2 = sub_9cde20(&g_e8e950);
        if (!v2)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_asn1.c", 466, "EC_GROUP_get_ecpkparameters");
            sub_a36abc(16, 0x8000d, 0);
            return v2;
        }
    }
    if (sub_a1abe0(a0) != 1)
    {
        *(unsigned int *)&v2->field_0 = 1;
        v5 = sub_a14dcc(a0, 0);
        v2->field_8 = v5;
        if (v5)
            return v2;
    }
    else if (sub_a1abcc(a0))
    {
        v3 = sub_a99624();
        if (v3 && sub_a9a7f0(v3))
        {
            *(unsigned int *)&v2->field_0 = 0;
            v2->field_8 = v3;
            return v2;
        }
        sub_a368c8(sub_9c3580(v3));
        sub_a369bc("crypto/ec/ec_asn1.c", 487, "EC_GROUP_get_ecpkparameters");
        sub_a36abc(16, 167, 0);
    }
    sub_9cd960(v2, &g_e8e950);
    return 0;
}
