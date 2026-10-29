/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4abfc..0xa4ae00 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4abfc_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a4abfc_0;

extern st_a4abfc_0 g_e9d568;
extern st_a4abfc_0 g_e9d578;
extern st_a4abfc_0 g_e9d588;
extern st_a4abfc_0 g_e9d598;
extern st_a4abfc_0 g_e9d5a8;
extern st_a4abfc_0 g_e9d5b8;
extern st_a4abfc_0 g_e9d5c8;
extern st_a4abfc_0 g_e9d5d8;
extern st_a4abfc_0 g_e9d5e8;
extern st_a4abfc_0 g_e9d5f8;
extern st_a4abfc_0 g_e9d608;
extern st_a4abfc_0 g_e9d618;
extern st_a4abfc_0 g_e9d628;
extern st_a4abfc_0 g_e9d638;
extern st_a4abfc_0 g_e9d648;

int sub_a4abfc(long long a0)
{
    st_a4abfc_0 *v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!_strcmp("B-163", a0))
    {
        v2 = &g_e9d568.padding_0[0];
    }
    else if (!_strcmp("B-233", a0))
    {
        v2 = &g_e9d578.padding_0[0];
    }
    else if (!_strcmp("B-283", a0))
    {
        v2 = &g_e9d588.padding_0[0];
    }
    else if (!_strcmp("B-409", a0))
    {
        v2 = &g_e9d598.padding_0[0];
    }
    else if (!_strcmp("B-571", a0))
    {
        v2 = &g_e9d5a8.padding_0[0];
    }
    else if (!_strcmp("K-163", a0))
    {
        v2 = &g_e9d5b8.padding_0[0];
    }
    else if (!_strcmp("K-233", a0))
    {
        v2 = &g_e9d5c8.padding_0[0];
    }
    else if (!_strcmp("K-283", a0))
    {
        v2 = &g_e9d5d8.padding_0[0];
    }
    else if (!_strcmp("K-409", a0))
    {
        v2 = &g_e9d5e8.padding_0[0];
    }
    else if (!_strcmp("K-571", a0))
    {
        v2 = &g_e9d5f8.padding_0[0];
    }
    else if (!_strcmp("P-192", a0))
    {
        v2 = &g_e9d608.padding_0[0];
    }
    else if (!_strcmp("P-224", a0))
    {
        v2 = &g_e9d618.padding_0[0];
    }
    else if (!_strcmp("P-256", a0))
    {
        v2 = &g_e9d628.padding_0[0];
    }
    else if (_strcmp("P-384", a0))
    {
        if (_strcmp("P-521", a0))
            return 0;
        v2 = &g_e9d648.padding_0[0];
    }
    else
    {
        v2 = &g_e9d638.padding_0[0];
    }
    return v2->field_8;
}
