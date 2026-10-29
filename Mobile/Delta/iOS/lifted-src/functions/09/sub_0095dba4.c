/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95dba4..0x95dd44 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern int g_e87328;
extern int g_e87338;
extern int g_e87348;
extern int g_e87358;
extern int g_e87368;
extern int g_e87378;
extern int g_e87388;
extern int g_e87398;

int sub_95dba4(int *a0, long long a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*(long long *)&a0[6] && !*(long long *)&a0[8])
        return 0;
    if (_strcmp("None", a1))
    {
        if (_strcmp("SSLv3", a1))
        {
            if (_strcmp("TLSv1", a1))
            {
                if (_strcmp("TLSv1.1", a1))
                {
                    if (_strcmp("TLSv1.2", a1))
                    {
                        if (_strcmp("TLSv1.3", a1))
                        {
                            if (_strcmp("DTLSv1", a1))
                            {
                                if (_strcmp("DTLSv1.2", a1))
                                {
                                    return 0;
                                }
                                else if (g_e87398 < 0)
                                {
                                    return 0;
                                }
                            }
                            else
                            {
                                if (g_e87388 < 0)
                                    return 0;
                            }
                        }
                        else
                        {
                            if (g_e87378 < 0)
                                return 0;
                        }
                    }
                    else
                    {
                        if (g_e87368 < 0)
                            return 0;
                    }
                }
                else
                {
                    if (g_e87358 < 0)
                        return 0;
                }
            }
            else
            {
                if (g_e87348 < 0)
                    return 0;
            }
        }
        else
        {
            if (g_e87338 < 0)
                return 0;
        }
    }
    else
    {
        if (g_e87328 < 0)
            return 0;
    }
}
